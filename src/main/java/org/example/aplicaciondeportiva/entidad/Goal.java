package org.example.aplicaciondeportiva.entidad;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Goal {
    private int goalID;
    private int scoreTeam1;
    private int scoreTeam2;
    private Integer matchMinute;  // puede ser null

    private int goalGetterID;
    private String goalGetterName;


    @JsonProperty("isPenalty")
    private boolean penalty;

    @JsonProperty("isOwnGoal")
    private boolean ownGoal;

    @JsonProperty("isOvertime")
    private boolean overtime;
    private String comment;

    // Getters y setters

    public int getGoalID() {
        return goalID;
    }

    public void setGoalID(int goalID) {
        this.goalID = goalID;
    }

    public int getScoreTeam1() {
        return scoreTeam1;
    }

    public void setScoreTeam1(int scoreTeam1) {
        this.scoreTeam1 = scoreTeam1;
    }

    public int getScoreTeam2() {
        return scoreTeam2;
    }

    public void setScoreTeam2(int scoreTeam2) {
        this.scoreTeam2 = scoreTeam2;
    }

    public Integer getMatchMinute() {
        return matchMinute;
    }

    public void setMatchMinute(Integer matchMinute) {
        this.matchMinute = matchMinute;
    }

    public int getGoalGetterID() {
        return goalGetterID;
    }

    public void setGoalGetterID(int goalGetterID) {
        this.goalGetterID = goalGetterID;
    }

    public String getGoalGetterName() {
        return goalGetterName;
    }

    public void setGoalGetterName(String goalGetterName) {
        this.goalGetterName = goalGetterName;
    }
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isPenalty() {
        return penalty;
    }

    public void setPenalty(boolean penalty) {
        this.penalty = penalty;
    }

    public boolean isOwnGoal() {
        return ownGoal;
    }

    public void setOwnGoal(boolean ownGoal) {
        this.ownGoal = ownGoal;
    }

    public boolean isOvertime() {
        return overtime;
    }

    public void setOvertime(boolean overtime) {
        this.overtime = overtime;
    }
}
