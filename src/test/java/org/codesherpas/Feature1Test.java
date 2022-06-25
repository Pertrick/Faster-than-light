package org.codesherpas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Feature1Test {

    Spaceship spaceship1 = new Spaceship(1);
    Spaceship spaceship2 = new Spaceship(2);
    Spaceship spaceship3 = new Spaceship(3);

    @Test
    public void setSpaceship1health(){
        spaceship1.setHealth(-1);
        assertEquals(spaceship1.getHealth(), 0);
    }

    @Test
    public void setSpaceship2health(){
        spaceship2.setHealth(0);
        assertEquals(spaceship2.getHealth(), 0);
    }
}
