package org.example.aplicaciondeportiva.controller;

import org.example.aplicaciondeportiva.entidad.MatchData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Controller
public class PartidoController {

    @GetMapping("/partido/{id}")
    public String detallePartido(@PathVariable("id") int id, Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.openligadb.de/getmatchdata/" + id;

        MatchData partido = restTemplate.getForObject(url, MatchData.class);

        // Buscar el resultado final (resultTypeID == 2 significa resultado final)
        if (partido.getMatchResults() != null) {
            partido.getMatchResults().stream()
                    .filter(r -> r.getResultTypeID() == 2)
                    .findFirst()
                    .ifPresent(partido::setFinalResult);
        }

        // Traducir la descripción del resultado final si existe
        if (partido.getFinalResult() != null) {
            String descOriginal = partido.getFinalResult().getResultDescription();
            String descTraducida = traducirDescripcion(descOriginal);
            partido.getFinalResult().setResultDescription(descTraducida);
        }

        model.addAttribute("partido", partido);
        return "FutbolAmericano/detalle-partido";
    }


    private String traducirDescripcion(String desc) {
        if (desc == null) return null;
        switch (desc.toLowerCase()) {
            case "finished": return "Finalizado";
            case "postponed": return "Pospuesto";
            case "cancelled": return "Cancelado";
            case "not started": return "No iniciado";
            case "ergebnis nach ende der offiziellen spielzeit": return "Resultado al final del tiempo oficial de juego";
            default: return desc;
        }
    }
}
