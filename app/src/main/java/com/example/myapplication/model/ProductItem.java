package com.example.myapplication.model;

public class ProductItem {
    String name;
    int count;
    boolean isChecked;
    double cost;
    String labelForCost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getLabelForCost() {
        return labelForCost;
    }

    public void setLabelForCost(String labelForCost) {
        this.labelForCost = labelForCost;
    }
}
