package org.monani.noflix.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record MovieDetails(@JsonAlias("Title") String title, @JsonAlias("Year") String year) {
}
