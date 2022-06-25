package org.codesherpas.service;

import org.codesherpas.Spaceship;

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

    public int shoot(Spaceship shootingSpaceshipId, Spaceship defendingSpaceshipId) {
        if (shootingSpaceshipId.getHealth() == 0) {
            System.out.println("Spaceship unable to shoot!");
            return shootingSpaceshipId.getHealth();
        } else if (shootingSpaceshipId.getId() == defendingSpaceshipId.getId()) {
            System.out.println("Spaceship cannot shoot at itself!");
            return shootingSpaceshipId.getHealth();
        } else {
            System.out.println("Spaceship with id:" +
                    shootingSpaceshipId.getId() +
                    " shooting at spaceship with id:" + defendingSpaceshipId.getId());
            defendingSpaceshipId.decreaseHealth();
            return defendingSpaceshipId.getHealth();
        }



    }

    }
