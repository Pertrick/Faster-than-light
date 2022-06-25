package org.codesherpas;

import org.codesherpas.service.SpaceshipService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Feature2Test {

        Spaceship spaceship1 = new Spaceship(1);
        Spaceship spaceship2 = new Spaceship(2);
        Spaceship spaceship3 = new Spaceship(3);


        @Test
        public void getAllSpaceship(){
           SpaceshipService service = new SpaceshipService();
           service.addSpaceship(spaceship1);
           service.addSpaceship(spaceship2);
           service.addSpaceship(spaceship3);

           assertEquals(service.getAllSpaceships(), 3);
        }

}
