package net.runnerdave.cars_with_spring.parts;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class SmallEngine implements Engine {
    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override

    public void startEngine() {
        System.out.println("started small " + horsePower + "hp engine");

    }
}
