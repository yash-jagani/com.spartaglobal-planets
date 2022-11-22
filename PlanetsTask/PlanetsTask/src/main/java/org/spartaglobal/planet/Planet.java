package org.spartaglobal.planet;

import java.math.BigDecimal;
import java.math.BigInteger;

public enum Planet {
    EARTH ("Earth", new BigInteger("93000000"), new BigDecimal("5.97E24")),
    JUPITER ("Jupiter", new BigInteger("484000000"), new BigDecimal("1.90E27")),
    SATURN ("Saturn", new BigInteger("889000000"), new BigDecimal("5.68E26")),
    MERCURY ("Mercury", new BigInteger("35000000"), new BigDecimal("3.30E23")),
    MARS ("Mars", new BigInteger("142000000"), new BigDecimal ("6.42E23")),
    VENUS ("Venus", new BigInteger("67000000"), new BigDecimal ("4.87E24")),
    URANUS ("Uranus", new BigInteger("1790000000"), new BigDecimal ("8.68E25")),
    NEPTUNE ("Neptune", new BigInteger("2880000000"), new BigDecimal ("1.02E26"));

    private final String planetName;
    private final BigInteger distanceFromSun;
    private final BigDecimal planetMass;

    private Planet (String planetName, BigInteger distanceFromSunMiles, BigDecimal planetMassKg){
        this.planetName = planetName;
        this.distanceFromSun = distanceFromSunMiles;
        this.planetMass = planetMassKg;
    }

    public String getPlanetName() {
        return planetName;
    }

    public BigInteger getDistanceFromSun() {
        return distanceFromSun;
    }

    public BigDecimal getPlanetMass(){
        return planetMass;
    }
}