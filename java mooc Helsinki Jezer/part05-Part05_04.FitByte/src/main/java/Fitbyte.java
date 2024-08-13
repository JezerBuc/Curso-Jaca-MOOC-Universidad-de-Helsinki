/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Fitbyte {
    
    private int age;
    private int frec;
    private double frecMax; 
    
    
    
    public Fitbyte(int edad, int frecuencia){
        this.age= edad; 
        this.frec=frecuencia;
        
    }//contructor 
    
    public double targetHeartRate(double frecuenciaMax){
        
        double objetivo =frecMax -(frec*age); 

        
        return objetivo;
    }//metodo targetHeartRate
    
    
}//clas Fitbyte
