package cells;

import handlers.CellHandler;

public class Emitter extends Cell{

    public Emitter(CellHandler handler, double[] location) {
        super(handler, location);
    }
    public void setActivation(double activation){
        this.states[0] = activation;
    }

}
