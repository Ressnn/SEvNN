package cells;

import handlers.CellHandler;

public class Receiver {
    public CellHandler handler;
    public double[] location;
    public double[] states;
    public Receiver(CellHandler handler, double[] location){
        this.handler = handler;
        this.location = location;
        this.states = new double[handler.settings.states];
        // this.g = this.handler.settings.gStates
    }

    public double getActivation(){
        return this.states[0];
    }

    public double[] getStates(){
        return this.states;
    }

}
