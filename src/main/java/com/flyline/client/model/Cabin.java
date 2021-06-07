package com.flyline.client.model;

import java.util.List;

public class Cabin {
    private String carrier;
    private String cabin_class;
    private String cabin_class_node;
    private List<String> fare_class_nodes;

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCabin_class() {
        return cabin_class;
    }

    public void setCabin_class(String cabin_class) {
        this.cabin_class = cabin_class;
    }

    public String getCabin_class_node() {
        return cabin_class_node;
    }

    public void setCabin_class_node(String cabin_class_node) {
        this.cabin_class_node = cabin_class_node;
    }

    public List<String> getFare_class_nodes() {
        return fare_class_nodes;
    }

    public void setFare_class_nodes(List<String> fare_class_nodes) {
        this.fare_class_nodes = fare_class_nodes;
    }
}
