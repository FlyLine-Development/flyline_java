package com.flyline.client.model;

public class Beverage {
    private String display_text;
    private String type;
    private String alcoholic_cost;
    private String nonalcoholic_cost;

    public String getDisplay_text() {
        return display_text;
    }

    public void setDisplay_text(String display_text) {
        this.display_text = display_text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlcoholic_cost() {
        return alcoholic_cost;
    }

    public void setAlcoholic_cost(String alcoholic_cost) {
        this.alcoholic_cost = alcoholic_cost;
    }

    public String getNonalcoholic_cost() {
        return nonalcoholic_cost;
    }

    public void setNonalcoholic_cost(String nonalcoholic_cost) {
        this.nonalcoholic_cost = nonalcoholic_cost;
    }
}
