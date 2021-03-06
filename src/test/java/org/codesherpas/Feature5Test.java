package org.codesherpas;

import org.codesherpas.service.SpaceshipService;
import org.codesherpas.weapon.ShootingWeapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Feature5Test {

    Spaceship spaceship1 = new Spaceship(1);
    Spaceship spaceship2 = new Spaceship(2);

    @Test
    public void destroyedShipShouldNotShoot(){
        spaceship1.setHealth(0);
        spaceship2.setHealth(5);
        SpaceshipService spaceshipService = new SpaceshipService();

        //assertEquals(spaceshipService.shoot(spaceship1, spaceship2), spaceship2.getHealth());

        spaceship1.setWeapon(new ShootingWeapon());

        assertEquals(spaceship1.getWeapon().useWeapon(spaceship1, spaceship2), 5);

    }


}
