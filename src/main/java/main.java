import strategy.animal.Animal;
import strategy.animal.Bird;
import strategy.behavior.WalkBehavior;

public class main {
    public static void main(String[] args) {
        Animal bird = new Bird("새");
        Animal bird2 = new Bird("새2");

        bird.setMove(new WalkBehavior());
        bird.move();
    }
}
