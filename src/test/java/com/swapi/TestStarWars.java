package com.swapi;

import controllers.PeopleController;
import models.PeopleModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStarWars {
    private List<String> films, vehicles, species, starships;
    private PeopleModel luke;

    @Before
    public void initCharacterLukeSkywalker() {
        films = new ArrayList<>();
        Collections.addAll(films,
                "The Empire Strikes Back",
                "Revenge of the Sith",
                "Return of the Jedi",
                "A New Hope",
                "The Force Awakens");

        vehicles = new ArrayList<String>(){{
            add("https://swapi.co/api/vehicles/14/");
            add("https://swapi.co/api/vehicles/30/");
        }};

        starships = new ArrayList<String>(){{
            add("https://swapi.co/api/starships/12/");
            add("https://swapi.co/api/starships/22/");
        }};

        species = new ArrayList<>();
        species.add("https://swapi.co/api/species/1/");

        //initialize character LukeSkywalker via Model
        luke = new PeopleModel(films,
                "https://swapi.co/api/planets/1/",
                "male", "fair",
                "2014-12-20T21:17:56.891000Z",
                "2014-12-09T13:50:51.644000Z",
                "77", vehicles,
                "https://swapi.co/api/people/1/",
                "blond", "19BBY",
                "blue", species,
                starships, "Luke Skywalker",
                "172");
    }

    @Test
    public void verifyThatFilmographyIsValidForCharacter1() {
        //get data for character 1
        PeopleModel character = new PeopleController().getPerson("1");
        //change all links with actual movie
        character.setFilms(films);
        //validate that received result equals to the expected data
        Assert.assertTrue(character.equals(luke));
    }
}
