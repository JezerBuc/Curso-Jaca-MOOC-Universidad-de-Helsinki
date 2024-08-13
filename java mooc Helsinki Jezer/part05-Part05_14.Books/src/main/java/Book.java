
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }//constructor 

    public String getName() {
        return name;
    }//getName

    public int getPublicationYear() {
        return publicationYear;
    }//get Año de publicacion
    
    @Override
    public boolean equals(Object comparar){
        if(this == comparar){
            return true;
        }
        if (!(comparar instanceof Book)){
            return false;     
        }      
        Book compararLibro = (Book) comparar;   
        
        if (this.name.equals(compararLibro.getName())
                && this.publicationYear == compararLibro.getPublicationYear()) {
            return true;
        }
        return false;
         
    }//equals

}//clase Book
