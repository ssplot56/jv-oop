package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer is started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer is stopped its work");
    }
}