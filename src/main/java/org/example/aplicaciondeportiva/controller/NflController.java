package org.example.aplicaciondeportiva.controller;

import org.example.aplicaciondeportiva.entidad.MatchData;
import org.example.aplicaciondeportiva.service.OpenLigaDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class NflController {
    @Autowired
    private OpenLigaDBService openLigaDBService;

    @GetMapping("/nfl")
    public String paginaNfl(Model model) {
        List<MatchData> partidosNfl = openLigaDBService.getMatchData("nfl", 2023);
        partidosNfl.forEach(m -> {
            System.out.println("MatchID: " + m.getMatchID());
            if (m.getTeam1() != null) {
                System.out.println("Team 1: " + m.getTeam1().getTeamName());
            } else {
                System.out.println("Team 1: null");
            }
            if (m.getTeam2() != null) {
                System.out.println("Team 2: " + m.getTeam2().getTeamName());
            } else {
                System.out.println("Team 2: null");
            }
        });
        model.addAttribute("partidos", partidosNfl);
        return "FutbolAmericano/nfl";
    }

}