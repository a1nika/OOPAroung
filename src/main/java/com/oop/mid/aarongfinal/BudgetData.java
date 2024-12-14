package com.oop.mid.aarongfinal;

public class BudgetData {
    private double allocatedAmount;
    private double usedAmount;
    private double remainingAmount;
    private String budgetCategory;
    private boolean overBudget;

    // Constructor
    public BudgetData(double allocatedAmount, double usedAmount, double remainingAmount, String budgetCategory, boolean overBudget) {
        this.allocatedAmount = allocatedAmount;
        this.usedAmount = usedAmount;
        this.remainingAmount = remainingAmount;
        this.budgetCategory = budgetCategory;
        this.overBudget = overBudget;
    }

    // Getters and Setters
    public double getAllocatedAmount() {
        return allocatedAmount;
    }

    public void setAllocatedAmount(double allocatedAmount) {
        this.allocatedAmount = allocatedAmount;
    }

    public double getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(double usedAmount) {
        this.usedAmount = usedAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public String getBudgetCategory() {
        return budgetCategory;
    }

    public void setBudgetCategory(String budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

    public boolean isOverBudget() {
        return overBudget;
    }

    public void setOverBudget(boolean overBudget) {
        this.overBudget = overBudget;
    }

    @Override
    public String toString() {
        return "BudgetData{" +
                "allocatedAmount=" + allocatedAmount +
                ", usedAmount=" + usedAmount +
                ", remainingAmount=" + remainingAmount +
                ", budgetCategory='" + budgetCategory + '\'' +
                ", overBudget=" + overBudget +
                '}';
    }
}