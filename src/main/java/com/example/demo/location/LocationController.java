package com.example.demo.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;
    @RequestMapping(value = "/locations")
    public List<Location> getAllLocations(){
        return locationService.getAllLocations();
    }
    @RequestMapping("/locations/{id}")
    public Location getLocation(@PathVariable String id){
        return locationService.getLocation(id);
    }
    @RequestMapping(value = "/locations",method = RequestMethod.POST)
    public void addLocation(@RequestBody Location location){
       locationService.addLocation(location);
    }
    @PutMapping("/locations/{id}")
    public void editLocation(@PathVariable String id,@RequestBody Location location){
        locationService.editLocation(id,location);
    }
    @DeleteMapping("/locations/{id}")
    public Location removeLocation(@PathVariable String id){
        return locationService.removeLocation(id);
    }

}
