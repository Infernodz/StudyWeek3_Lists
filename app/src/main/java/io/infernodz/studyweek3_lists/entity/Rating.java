package io.infernodz.studyweek3_lists.entity;


public class Rating {

    private double rating;
    private String name;

    public Rating(double rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }
}
