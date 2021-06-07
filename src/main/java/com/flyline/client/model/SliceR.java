package com.flyline.client.model;

import java.util.List;

public class SliceR {
    private String origin;
    private String destination;
    private String duration;
    private List<Slice_Segment> sliceSegments;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Slice_Segment> getSliceSegments() {
        return sliceSegments;
    }

    public void setSliceSegments(List<Slice_Segment> sliceSegments) {
        this.sliceSegments = sliceSegments;
    }
}
