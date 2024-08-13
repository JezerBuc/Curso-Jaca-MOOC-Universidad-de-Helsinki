/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class TeamsStatistics {
    
    private String teamL;
    private String teamV;
    private int poinstL;
    private int pointsV;
    private int games;
    private int wins;
    private int losses; 
    
    public TeamsStatistics (String nameLocal, String nameVisit, int pointsL, int pointsV){
        this.teamL=nameLocal;
        this.teamV=nameVisit;
        this.poinstL=pointsL;
        this.pointsV=pointsV;
        
    }//constructor team
    
    public String getLocalName(){
        return teamL;
        
    }//getLocalName
    
    public String getVisitingName(){
        return teamV;
    }//getVisitantn
    
    public int getPointsLocal(){
        return poinstL;
    }//getPointsLocal
    
    public int getPointsVisiting(){
        return pointsV;
    }//getPointsVisiting
    
    public int playGame(){
        return this.games+=1;
    }//playGame
    
    public int setWins(){
        return this.wins += 1;
       
    }//setWins
    
    public int setLosses(){
        return this.losses+=1;
    }//setLosses
    
    
    public int getWins(){
        return this.wins;
    }//getWins
    
    public int getLosses(){
        return this.losses;
    }//getLosses
    
   
            
    
}//clas


/*

for(TeamsStatistics team: records){
            if(team.getLocalName().contains(teamName)){
                cont+=1;
                
                if(team.getPointsLocal()>= team.getPointsLocal()){
                    wins+=1;
                    team.setWins();
                }else{
                    losses+=1;
                    team.setLosses();
                }//else
            }else if(team.getVisitingName().contains(teamName)){
                cont++;
                if (team.getPointsVisiting()>= team.getPointsLocal()){
                    wins+=1;
                    team.setWins();
                }else{
                    losses+=1;
                    team.setLosses();
                }//else
                
                team.playGame();
            }
            
        }//for
        
        System.out.println("Games: " + cont);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

*/