package net.runnerdave.manufacturing_process.processes;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public abstract class ProductProcess {

    private String processName;

    public ProductProcess(String name) {
        this.processName = name;
    }

    public String getProcessName(){
        return processName;
    }

    public void process() {
        assembly();
        testing();
        packaging();
        storing();
    }

    protected abstract void assembly();
    protected abstract void testing();
    protected abstract void packaging();
    protected abstract void storing();

}

