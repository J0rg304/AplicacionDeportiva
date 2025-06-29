package org.example.aplicaciondeportiva.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.aplicaciondeportiva.entidad.MatchData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class OpenLigaDBService {
    private final RestTemplate restTemplate = new RestTemplate();

    public List<MatchData> getMatchData(String leagueShortcut, int season) {
        String url = String.format("https://api.openligadb.de/getmatchdata/%s/%d", leagueShortcut, season);
        System.out.println("URL llamada: " + url);

        String jsonResponse = restTemplate.getForObject(url, String.class);
        System.out.println("Respuesta JSON cruda:\n" + jsonResponse);

        ObjectMapper mapper = new ObjectMapper();
        try {
            MatchData[] matches = mapper.readValue(jsonResponse, MatchData[].class);

            // Asignar el resultado final si existe (resultTypeID == 2)
            for (MatchData match : matches) {
                if (match.getMatchResults() != null) {
                    match.getMatchResults().stream()
                            .filter(result -> result.getResultTypeID() == 2)
                            .findFirst()
                            .ifPresent(match::setFinalResult);
                }
            }

            return Arrays.asList(matches);
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }
}