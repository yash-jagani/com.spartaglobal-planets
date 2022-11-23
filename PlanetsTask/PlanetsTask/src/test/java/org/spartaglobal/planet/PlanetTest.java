package org.spartaglobal.planet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    @DisplayName("planetName should equal the String of the planet EARTH")
    void checkNameEarth(){
        String expected = "Earth";
        assertEquals(expected, Planet.EARTH.getPlanetName());
    }

    @Test
    @DisplayName("distanceFromSun should equal the distance from the Sun of the planet NEPTUNE")
    void checkDistanceNeptune(){
        BigInteger expected = new BigInteger("2880000000");
        assertEquals(expected, Planet.NEPTUNE.getDistanceFromSun());
    }

    @Test
    @DisplayName("planetMass should equal the mass of the planet SATURN")
    void checkMassSaturn(){
        BigDecimal expected = new BigDecimal("5.68E26");
        assertEquals(expected, Planet.SATURN.getPlanetMass());
    }
}