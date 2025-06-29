package org.example.aplicaciondeportiva.controller;

import org.example.aplicaciondeportiva.entidad.MatchData;
import org.example.aplicaciondeportiva.entidad.MatchResult;
import org.example.aplicaciondeportiva.service.OpenLigaDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatchController {
    @Autowired
    private OpenLigaDBService openLigaDBService;

    @GetMapping("/matches")
    public List<MatchData> getMatches(@RequestParam String league, @RequestParam int season) {

        return openLigaDBService.getMatchData(league, season);
    }
}
