package com.example.demo.location;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LocationService {
    Location location1=new Location("L1","Nakuru");
    Location location2=new Location("L2","Mandera");
    Location location3=new Location("L3","Turkana");
    List<Location> locations= new ArrayList<>(Arrays.asList(location1,location2,location3));
    public List<Location> getAllLocations(){
        return locations;
    }
    public Location getLocation(String id){
        Location location=locations.stream().filter(k -> id.equals(k.getId())).findFirst().orElse(null);
        return location;
    }
    public void addLocation(Location location){
        locations.add(location);
    }
    public void editLocation(String id,Location newLocation){
        locations.stream().filter(k -> id.equals(k.getId())).findFirst().map(t ->{

                                            t.setLocation(newLocation.getId(),newLocation.getName());
            return null;
        });
    }
    public Location removeLocation(String id){
        locations.removeIf(l -> l.getId().equals(id));
        return null;
    }

}
