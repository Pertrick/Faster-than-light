package org.codesherpas;

public class Spaceship {
    private int id;
    private int health;

    public Spaceship(int id) {
        this.id = id;
        this.health = 5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        if(health <=0) {
            System.out.println("Spaceship with id:" +getId() + " destroyed.");
            health = 0;
            return health;
        }
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int increaseHealth(){
        return health++;
    }

    public int decreaseHealth(){
        if(health >0){
            return health--;
        }else{
            health =0;
            return health;
        }
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "id=" + id +
                ", health=" + health +
                '}';
    }
}
