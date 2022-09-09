package network;

public class NetworkStates {

    public int states;
    public int lDims;
    public int gStates;
    public int maxIncoming;
    public int maxOutgoing;
    public void NetworkStates(int numStates,int locationDims,int globalStates,int maxIncomingConnections, int maxOutgoingConnections) {
        states = numStates;
        lDims = locationDims;
        gStates = globalStates;
        maxIncoming = maxIncomingConnections;
        maxOutgoing = maxOutgoingConnections;
    }

    public int getgStates() {
        return gStates;
    }

    public int getlDims() {
        return lDims;
    }

    public int getStates() {
        return states;
    }

    public int getMaxIncoming() {
        return maxIncoming;
    }

    public int getMaxOutgoing() {
        return maxOutgoing;
    }
}


