
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }//constructor Song (artista, nombre, duracion)
    
    public boolean equals(Object comparar){
     
        if(this == comparar){
            return true;
        }
        if(!(comparar instanceof Song)){
            return false;
        }
        
        Song compararSong = (Song) comparar;
        
        return this.artist.equals(compararSong.artist) && 
                this.name.equals(compararSong.name) &&
                this.durationInSeconds == compararSong.durationInSeconds;
    }//equals

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }//toString

}//clase Song
