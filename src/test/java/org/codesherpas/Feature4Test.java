package org.codesherpas;

import org.codesherpas.service.SpaceshipService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Feature4Test {

    Spaceship spaceship1 = new Spaceship(1);

    @Test
    public void getSpaceshipHealth(){
        spaceship1.setHealth(-5);
        assertNotEquals(spaceship1.getHealth(), -5);
    }
}
