package org.example.aplicaciondeportiva.entidad;

public class MatchResult {
    //@JsonProperty("PointsTeam1")
    private int pointsTeam1;
    //@JsonProperty("PointsTeam2")
    private int pointsTeam2;
    //@JsonProperty("ResultName")
    private String resultName;
    private int resultID;
    private int resultOrderID;
    private int resultTypeID;
    private String resultDescription;


    public int getPointsTeam1() {
        return pointsTeam1;
    }

    public void setPointsTeam1(int pointsTeam1) {
        this.pointsTeam1 = pointsTeam1;
    }

    public int getPointsTeam2() {
        return pointsTeam2;
    }

    public void setPointsTeam2(int pointsTeam2) {
        this.pointsTeam2 = pointsTeam2;
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public int getResultID() {
        return resultID;
    }

    public void setResultID(int resultID) {
        this.resultID = resultID;
    }

    public int getResultOrderID() {
        return resultOrderID;
    }

    public void setResultOrderID(int resultOrderID) {
        this.resultOrderID = resultOrderID;
    }

    public int getResultTypeID() {
        return resultTypeID;
    }

    public void setResultTypeID(int resultTypeID) {
        this.resultTypeID = resultTypeID;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }
}