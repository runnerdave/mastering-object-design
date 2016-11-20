package net.runnerdave.cars_with_spring.parts;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class LargeEngine implements Engine {
    private int horsePower;

    public LargeEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("started large " + horsePower + " hp engine");
    }
}
