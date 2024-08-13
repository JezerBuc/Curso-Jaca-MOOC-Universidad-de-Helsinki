
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cont=0, wins =0, losses=0;
  
        System.out.println("File:");
        String file = scan.nextLine();      
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        ArrayList<TeamsStatistics> records = readRecordsFile(file);
        for (TeamsStatistics team : records) {
            if (team.getLocalName().equals(teamName)) {
                cont++;
                
                if (team.getPointsLocal() > team.getPointsVisiting()) {
                    wins++;
                } else {
                    losses++;
                }
            } else if (team.getVisitingName().equals(teamName)) {
                cont++;
                
                if (team.getPointsVisiting() > team.getPointsLocal()) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        
        System.out.println("Games: " + cont);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }//main
    
    
    public static ArrayList<TeamsStatistics> readRecordsFile (String file){
        ArrayList<TeamsStatistics> equipos = new ArrayList<>();
        String localTeam = "";
        String visitTeam = "";
        int pointsL = 0;
        int pointsV = 0;
        
        try(Scanner sc = new Scanner(Paths.get(file))){           
            while (sc.hasNextLine()) {
                String fila = sc.nextLine();              
                String [] sp = fila.split(",");
                localTeam = sp[0];
                visitTeam = sp[1];
                pointsL = Integer.valueOf(sp[2]);
                pointsV = Integer.valueOf(sp[3]);   
                
                equipos.add(new TeamsStatistics(localTeam, visitTeam, pointsL, pointsV));
            }//while
            
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
           
        }//catch
        
        return equipos; 
    }

}//class SportStatistics

/*
FURIA, NRG,7,16
FURIA,Prospects,16,1

Escriba un programa que inscriba al usuario para un nombre de archivo, que lee las estadísticas del archivo. 
El programa entonces incita al usuario por el nombre de un equipo, e imprime los datos especificados en las siguientes partes para ese equipo.
Juegos Jugados

Implemente a la salida del número de partidos jugados por un equipo dado. Estamos usando el archivo data.csv antes mencionado.

Sample output

File:
data.csv
Team:
FURIA
Games: 2

*/

/*


*/
