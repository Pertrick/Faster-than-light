package org.codesherpas.weapon;

import org.codesherpas.Spaceship;

public class ShootingWeapon implements Weapon{
    @Override
    public int useWeapon(Spaceship shootingSpaceship, Spaceship defendingSpaceship) {
        if (shootingSpaceship.getHealth() == 0) {
            System.out.println("Spaceship unable to shoot!");
            return defendingSpaceship.getHealth();
        } else if (shootingSpaceship.getId() == defendingSpaceship.getId()) {
            System.out.println("Spaceship cannot shoot at itself!");
            return shootingSpaceship.getHealth();
        } else {
            System.out.println("Spaceship with id:" +
                    shootingSpaceship.getId() +
                    " shooting at spaceship with id:" + defendingSpaceship.getId());
            defendingSpaceship.decreaseHealth();
            return defendingSpaceship.getHealth();
        }

    }


}
