/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Cube {
    private int edgeLength;
    
    public Cube(int edgeLongitud){
        this.edgeLength=edgeLongitud;
        
    }//constructor
    
    public int volume(){
        return edgeLength*edgeLength*edgeLength;
    }//metodo volumen
    
    public String toString(){
        return "The length of the edge is " + this.edgeLength + " and the volume " + volume();
    }
    
}//clase Cubo
