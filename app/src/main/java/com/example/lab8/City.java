package com.example.lab8;

import java.util.Objects;

/**
 * This is a class that defines a City
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name
     * @return
     * Return city name
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Get the province name
     * @return
     * Return province name
     */

    public String getProvinceName() {
        return this.province;
    }

    /**
     * Able to sort the city objects
     * @param city
     * city is the object we are comparing
     * @return
     * return the comparable interface
     */
    @Override
    public int compareTo(City city) {
        // City city = (City) city;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Determines if objects are equal
     * @param o
     * o is the reference object
     * @return
     * Return True or False if equal or not equal
     */

    @Override
    public boolean equals (Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        City equalCity = (City) o;
        return city.equals(equalCity.city) && province.equals(equalCity.province);

    }

    /**
     * Gets hash code for city
     * @return
     * Returns the hash code of city
     * reference https://www.baeldung.com/java-hashcode
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }

}