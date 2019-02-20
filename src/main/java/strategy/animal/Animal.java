package strategy.animal;

import strategy.behavior.MoveBehavior;

public abstract class Animal {
    public String name;
    MoveBehavior moveBehavior;

    public Animal(String name){
        this.name = name;
    }

    public void move(){
       moveBehavior.move(this.name);
    }

    public void setMove(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }
}
