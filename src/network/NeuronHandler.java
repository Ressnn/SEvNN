package network;
import network.NetworkStates;

public class NeuronHandler {

    SelfEvolvingNetwork nn;
    public NetworkStates settings;
    public NeuronHandler(SelfEvolvingNetwork nn){
        this.nn = nn;
        this.settings = nn.settings;
    }

}
