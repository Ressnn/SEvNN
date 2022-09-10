package handlers;
import cells.Cell;
import network.NetworkStates;
import network.SelfEvolvingNetwork;

import java.util.ArrayList;

public class CellHandler {

    SelfEvolvingNetwork nn;
    public NetworkStates settings;

    public ArrayList<Cell> cells;

    public CellHandler(SelfEvolvingNetwork nn){
        this.nn = nn;
        this.settings = nn.getSettings();
    }

}
