/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Book {
    private String author;
    private String name;
    private int pages;
    
    public Book(String autor, String nombre, int paginas){
        this.author = autor;
        this.name=nombre;
        this.pages = paginas;
        
    }//constructor
    
    public String getAuthor(){
        return author;
    }//getAuthor
    
    public String getName(){
        return name;
    }//getName
    
    public int getPages(){
        return pages;
    }//getPages
    
    public String toString(){
        return author + ", " + name + ", " + pages + " pages";
    }//toString


}//clase Book

/*


*/
