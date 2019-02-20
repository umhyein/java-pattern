package strategy.behavior;

public class SwimBehavior implements MoveBehavior {
    @Override
    public void move(String name) {
        System.out.println(name + " 이(가) 수영한다.");
    }
}
