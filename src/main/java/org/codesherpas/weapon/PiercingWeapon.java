package org.codesherpas.weapon;

import org.codesherpas.Spaceship;

public class PiercingWeapon  implements Weapon{

    @Override
    public int useWeapon(Spaceship shootingSpaceship, Spaceship defendingSpaceship) {
        return -5;
    }
}
