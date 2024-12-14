package com.oop.mid.aarongfinal;

import java.time.LocalDate;

public class MarketResearch {
    private String id;
    private String name;
    private LocalDate dob;
    private String competitor;
    private String description;
    private String audience;
    private String targetRegion;

    public MarketResearch(String id, String name, LocalDate dob, String competitor, String description, String audience, String targetRegion) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.competitor = competitor;
        this.description = description;
        this.audience = audience;
        this.targetRegion = targetRegion;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getCompetitor() {
        return competitor;
    }

    public void setCompetitor(String competitor) {
        this.competitor = competitor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getTargetRegion() {
        return targetRegion;
    }

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }
}
