package network;
import network.NetworkStates;

public class SelfEvolvingNetwork {

    NetworkStates settings;
    public SelfEvolvingNetwork(NetworkStates settings){
        this.settings = settings;
    }

    public NetworkStates getSettings(){
        return settings;
    }

}
