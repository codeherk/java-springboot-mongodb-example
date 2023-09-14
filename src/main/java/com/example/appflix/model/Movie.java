package com.example.appflix.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="movies")
public class Movie {
    @Id
    private String id;
    private String plot;
    private List<String> genre;
    private int runtime;
    private String poster;
    private String title;
    private String fullPlot;
    private String rated;
    private String awards;
    private String lastUpdated;
    private int year;
    private String type;
    private int numComments;

    // public empty constructor needed for retrieving the POJO
    public Movie() {}

    public Movie(String id, String plot, List<String> genre, int runtime, String poster, String title, String fullPlot, String rated, String awards, String lastUpdated, int year, String type, int numComments) {
        super();
        this.id = id;
        this.plot = plot;
        this.genre = genre;
        this.runtime = runtime;
        this.poster = poster;
        this.title = title;
        this.fullPlot = fullPlot;
        this.rated = rated;
        this.awards = awards;
        this.lastUpdated = lastUpdated;
        this.year = year;
        this.type = type;
        this.numComments = numComments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullPlot() {
        return fullPlot;
    }

    public void setFullPlot(String fullPlot) {
        this.fullPlot = fullPlot;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumComments() {
        return numComments;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", plot='" + plot + '\'' +
                ", genre=" + genre +
                ", runtime=" + runtime +
                ", poster='" + poster + '\'' +
                ", title='" + title + '\'' +
                ", fullPlot='" + fullPlot + '\'' +
                ", rated='" + rated + '\'' +
                ", awards='" + awards + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", numComments=" + numComments +
                '}';
    }
}

