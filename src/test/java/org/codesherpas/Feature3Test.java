package org.codesherpas;

import org.codesherpas.service.SpaceshipService;
import org.codesherpas.weapon.ShootingWeapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Feature3Test {

        Spaceship spaceship1 = new Spaceship(1);
        Spaceship spaceship2 = new Spaceship(2);
        Spaceship spaceship3 = new Spaceship(3);

        @Test
        public void shoot(){
            SpaceshipService spaceshipService = new SpaceshipService();

//            assertEquals( spaceshipService.shoot(spaceship1, spaceship2), 4);

                spaceship1.setWeapon(new ShootingWeapon());
                assertEquals(spaceship1.getWeapon().useWeapon(spaceship1, spaceship2), 4);

        }

}
