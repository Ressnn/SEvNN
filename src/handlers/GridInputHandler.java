package handlers;

import network.SelfEvolvingNetwork;
import java.util.HashMap;


public class GridInputHandler extends InputHandler{




    public GridInputHandler(SelfEvolvingNetwork nn, double[] shape, double[] lower_left, double[] upper_right){
        super(nn);
        generateCells(shape,lower_left,upper_right);
    }

    public void generateCells(double[] shape, double[] lower_left, double[] upper_right){





    }

}
