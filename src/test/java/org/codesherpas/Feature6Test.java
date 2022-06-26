package org.codesherpas;

import org.codesherpas.service.SpaceshipService;
import org.codesherpas.weapon.PiercingWeapon;
import org.codesherpas.weapon.ShootingWeapon;
import org.codesherpas.weapon.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Feature6Test {

    Spaceship spaceship1 = new Spaceship(1);
    Spaceship spaceship2 = new Spaceship(2);

    @Test
    public void useWeapon(){
        spaceship2.setHealth(5);
        spaceship1.setWeapon(new ShootingWeapon());

        assertEquals(spaceship1.getWeapon().useWeapon(spaceship1, spaceship2), 4);

    }
}
