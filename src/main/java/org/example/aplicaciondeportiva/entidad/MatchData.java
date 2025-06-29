package org.example.aplicaciondeportiva.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchData {
    private MatchResult finalResult;

    private int matchID;           // coincide con "matchID"
    private String matchDateTime;  // coincide con "matchDateTime"
    private Team team1;            // coincide con "team1"
    private Team team2;            // coincide con "team2"
    private List<MatchResult> matchResults;
    private List<Goal> goals;
    private boolean matchIsFinished;
    private String timeZoneID;
    private String leagueName;
    private String leagueSeason;


    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueSeason() {
        return leagueSeason;
    }

    public void setLeagueSeason(String leagueSeason) {
        this.leagueSeason = leagueSeason;
    }

    public String getTimeZoneID() {
        return timeZoneID;
    }

    public void setTimeZoneID(String timeZoneID) {
        this.timeZoneID = timeZoneID;
    }

    public boolean isMatchIsFinished() {
        return matchIsFinished;
    }

    public void setMatchIsFinished(boolean matchIsFinished) {
        this.matchIsFinished = matchIsFinished;
    }

    public List<MatchResult> getMatchResults() {
        return matchResults;
    }

    public int getMatchID() {
        return matchID;
    }

    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }

    public String getMatchDateTime() {
        return matchDateTime;
    }

    public void setMatchDateTime(String matchDateTime) {
        this.matchDateTime = matchDateTime;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public void setMatchResults(List<MatchResult> matchResults) {
        this.matchResults = matchResults;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    public MatchResult getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(MatchResult finalResult) {
        this.finalResult = finalResult;
    }


}
