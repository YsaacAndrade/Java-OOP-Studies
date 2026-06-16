package org.monani.noflix.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Series extends Details{
    private String title;
    private String year;
    private int seasons;

    @JsonAlias("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonAlias("Year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonAlias("totalSeasons")
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nSeasons: " + seasons + "\nYear: " + year;
    }

}
