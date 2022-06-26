package org.codesherpas.service;

import org.codesherpas.Spaceship;
import org.codesherpas.weapon.ShootingWeapon;
import org.codesherpas.weapon.Weapon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpaceshipService {
    List<Spaceship> spaceships = new ArrayList<>();

    public void addSpaceship(Spaceship spaceship){
        spaceships.add(spaceship);
    }

    public int getAllSpaceships(){
       List<Spaceship> allSpaceships=  Collections.unmodifiableList(spaceships);
       System.out.println(allSpaceships);
        return spaceships.size();
    }

    public Spaceship getSpaceship(int id){
        for(Spaceship s: spaceships){
            if(id == s.getId() ){
                return s;
            }
        }
        return null;
    }

    }
