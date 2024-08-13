/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Archive {
    private String identificador;
    private String name;
    
    public Archive(String identificador, String name){
        this.identificador = identificador;
        this.name = name;
        
    }//constructor 
    
    public Archive(String identificador){
        this(identificador, "");
        
    }
    
    public String getIdentificador(){
        return this.identificador;  
    }//getIdentificador
    
    public String getName(){
        return this.name;
    }//getName
    
    @Override
    public boolean equals(Object comparar){
        if(this == comparar){
            return true;
        }
        if(!(comparar instanceof Archive)){
            return false;
        }
        
        Archive compArchivo = (Archive) comparar;
        
        if (this.identificador.equals(compArchivo.getIdentificador())){
            return true;
            
        }else{
            return false;
            
        }
            
    }//equals
    
    @Override
    public int hashCode() {
        return this.identificador.hashCode();
    }
    
    @Override
    public String toString(){
        return this.identificador + ": " + this.name;
    }//toString
    
    

}//clase Archivo
