package cells;

import java.util.ArrayList;

import connectors.Connection;
import handlers.CellHandler;
import network.GlobalVals;
public class Neuron {

    public CellHandler handler;
    public double[] location;
    public ArrayList<Connection> outgoingConnections;
    public ArrayList<Connection> incomingConnections;
    public GlobalVals g;
    public double[] states;


    public Neuron(CellHandler handler, double[] location){
        this.handler = handler;
        this.location = location;
        this.states = new double[handler.settings.states];
        // this.g = this.handler.settings.gStates
    }

    public void addIncomingConnection(Connection conn){
        incomingConnections.add(conn);
    }

    public void addOutgoingConnection(Connection conn){
        outgoingConnections.add(conn);
    }

}
