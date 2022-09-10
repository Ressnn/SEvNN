package cells;

import handlers.CellHandler;

public class Cell {

    public CellHandler handler;
    public double[] location;
    public double[] states;

    public Cell(CellHandler handler, double[] location){
        this.handler = handler;
        this.location = location;
        this.states = new double[handler.settings.states];
        // this.g = this.handler.settings.gStates
    }

}
