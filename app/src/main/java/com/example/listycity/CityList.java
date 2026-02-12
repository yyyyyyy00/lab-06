package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *   This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *   Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Check if city is stored
     * @param city city to check
     * @return true if exist, false if not
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Delete city from list if exist
     * @param city city to delete
     * @throws IllegalArgumentException If the city is not present in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City does not exist!");
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list.
     * @return The count of cities
     */
    public int countCities() {
        return cities.size();
    }

}
