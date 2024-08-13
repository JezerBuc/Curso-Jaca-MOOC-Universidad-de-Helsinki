/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Books {
    
    private String tittle;
    private int pages;
    private int year;
    
    public Books(String titulo, int paginas, int anho){
        this.tittle = titulo;
        this.pages = paginas;
        this.year = anho;
    }//constructor
    
    public String getName(){
        return tittle;
    }//getName
    
    public int getPages(){
        return pages;
    }//getPages
    
    public int getYear(){
        return year;
    }//getYear
    
    @Override
    public String toString(){
        return this.tittle+ ", "+ this.pages + " pages, " + this.year;
        
    }//toString
   
    
}//clase Books

/*


What information will be printed? everything
To Kill a Mockingbird, 281 pages, 1960
A Brief History of Time, 256 pages, 1988
Beautiful Code, 593 pages, 2007
The Name of the Wind, 662 pages, 2007

What information will be printed? name
To Kill a Mockingbird
A Brief History of Time
Beautiful Code
The Name of the Wind


Title: To Kill a Mockingbird
Pages: 281
Publication year: 

*/