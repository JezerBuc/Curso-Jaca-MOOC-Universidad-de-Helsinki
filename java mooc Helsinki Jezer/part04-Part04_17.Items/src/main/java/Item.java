
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    private String name;
    private LocalDateTime createdAt;

    public Item(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }//constructor

    public String getName() {
        return name;
    }//metodo devuelve el nombre

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        return this.name + " (created at: " + formatter.format(this.createdAt) + ")";
    }
}
