/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemychalleng2;

/**
 *
 * @author boker
 */
public class UdemyChalleng2 {
 
    public static void displayHighScore(String playerName ,int highScoreposition){
        System.out.println(playerName + "  " +"manage to get into" + " " + highScoreposition + " "+ "high score table" );
    }
    public static int calculateHighScore(int playerScore){
        if(playerScore>1000){
        return 1;
        }else if(playerScore > 500 && playerScore  < 1000){
      return 2;  
    }else if(playerScore >100 && playerScore  < 500){
    return 3;
        
    }else {
        return 4;
    }
    }  
    public static void main(String[] args) {
      int highScorePosition=calculateHighScore(1500);
       displayHighScore("jack",highScorePosition);
    
    highScorePosition=calculateHighScore(800);
    displayHighScore("steve",highScorePosition);
    
    highScorePosition=calculateHighScore(400);
    displayHighScore("ken",highScorePosition);
    
     highScorePosition=calculateHighScore(2);
    displayHighScore("ken",highScorePosition);
}
}