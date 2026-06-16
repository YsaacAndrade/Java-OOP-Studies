package org.monani.noflix.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie extends Details {
    private String title;
    private String year;
    private String runtime;

    @JsonAlias("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonAlias("Year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonAlias("Runtime")
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nRuntime: " + runtime + "\nYear: " + year;
    }

    public String getTitle() {
        return title;
    }
}