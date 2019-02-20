package strategy.behavior;

public class FlyBehavior implements MoveBehavior{

    @Override
    public void move(String name) {
        System.out.println(name + " 이(가) 날아간다.");
    }
}
