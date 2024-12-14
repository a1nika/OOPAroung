// Model Class
package com.oop.mid.aarongfinal;

public class CorrectiveActions {

    private String requirement;
    private String riskLevel;
    private String status;

    // Constructor
    public CorrectiveActions(String requirement, String riskLevel, String status) {
        this.requirement = requirement;
        this.riskLevel = riskLevel;
        this.status = status;
    }

    // Getters and setters
    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
