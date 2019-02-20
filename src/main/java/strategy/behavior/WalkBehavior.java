package strategy.behavior;

public class WalkBehavior implements MoveBehavior {
    @Override
    public void move(String name) {
        System.out.println(name + " 이(가) 걸어간다.");
    }
}
