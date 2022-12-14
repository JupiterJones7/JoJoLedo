package com.example.JoJoLedo.lists;

import com.example.JoJoLedo.model.Location;

import java.util.List;

public class LocationList {
    private List<Location> locations = List.of(
            new Location("Japan"),
            new Location("Singapore"),
            new Location("Hong Kong"),
            new Location("Pakistan"),
            new Location("India"),
            new Location("Saudi Arabia")
    );

    public List<Location> getLocations() {
        return locations;
    }
}
