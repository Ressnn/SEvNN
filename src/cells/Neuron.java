package cells;
import network.NeuronHandler;
public class Neuron {

    public NeuronHandler handler;
    public int[] location;
    public double[] g;
    public Neuron(NeuronHandler handler, int[] location){
        this.handler = handler;
        this.location = location;
        this.g = new double[this.handler.settings.gStates];
    }

}
