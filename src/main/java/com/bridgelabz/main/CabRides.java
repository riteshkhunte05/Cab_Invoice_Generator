package com.bridgelabz.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CabRides {
    Map<String, ArrayList<Ride>> userRides = null;

    public CabRides() {
        this.userRides = new HashMap<>();
    }

    public void addRides(String userId, Ride[] rides) {
        this.userRides.put(userId, new ArrayList<>(Arrays.asList(rides)));
    }

    public Ride[] getRides(String userId) {
        return this.userRides.get(userId).toArray(new Ride[0]);
    }
}