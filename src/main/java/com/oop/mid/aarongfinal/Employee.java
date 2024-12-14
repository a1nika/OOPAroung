package com.oop.mid.aarongfinal;

public class Employee {
    private String id;
    private String name;
    private String department;
    private String skill;
    private int presentDays;
    private int absentDays;
    private String project;
    private String selfEvaluation;
    private String rating;
    private String notes;

    public Employee(String id, String name, String department, String skill, int presentDays, int absentDays,
                    String project, String selfEvaluation, String rating, String notes) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.skill = skill;
        this.presentDays = presentDays;
        this.absentDays = absentDays;
        this.project = project;
        this.selfEvaluation = selfEvaluation;
        this.rating = rating;
        this.notes = notes;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getSkill() { return skill; }
    public void setSkill(String skill) { this.skill = skill; }

    public int getPresentDays() { return presentDays; }
    public void setPresentDays(int presentDays) { this.presentDays = presentDays; }

    public int getAbsentDays() { return absentDays; }
    public void setAbsentDays(int absentDays) { this.absentDays = absentDays; }

    public String getProject() { return project; }
    public void setProject(String project) { this.project = project; }

    public String getSelfEvaluation() { return selfEvaluation; }
    public void setSelfEvaluation(String selfEvaluation) { this.selfEvaluation = selfEvaluation; }

    public String getRating() { return rating; }
    public void setRating(String rating) { this.rating = rating; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}
