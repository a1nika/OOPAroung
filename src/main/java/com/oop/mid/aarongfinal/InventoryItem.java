package com.oop.mid.aarongfinal;

import java.time.LocalDate;

public class InventoryItem {
    private String id;
    private String name;
    private String category;
    private LocalDate allocationDate;

    public InventoryItem(String id, String name, String category, LocalDate allocationDate) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.allocationDate = allocationDate;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getAllocationDate() {
        return allocationDate;
    }

    public void setAllocationDate(LocalDate allocationDate) {
        this.allocationDate = allocationDate;
    }
}
