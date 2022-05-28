package com.company;

enum Lights{
    RED,YELLOW,GREEN
}
class Simulation_56874{
    Lights Ls = Lights.RED;
    void ChangeColor_56874(){
        switch (Ls){
            case RED :
                Ls=Lights.YELLOW;
                break;
            case YELLOW :
                Ls=Lights.GREEN;
                break;
            case GREEN :
                Ls=Lights.RED;
                break;
        }
    }
    public String toString(){
        return " "+Ls;
    }

}


public class trafficlights {
    public static void main(String[] args) {
        Simulation_56874 tfs = new Simulation_56874();
        for (int i = 0; i < 6; i++) {
            System.out.println(tfs);
            tfs.ChangeColor_56874();
        }
    }
}