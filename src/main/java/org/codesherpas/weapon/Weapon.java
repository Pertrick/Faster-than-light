package org.codesherpas.weapon;

import org.codesherpas.Spaceship;

public interface Weapon {

    int useWeapon(Spaceship shootingSpaceship, Spaceship defendingSpaceship);
}
