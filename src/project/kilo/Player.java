/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project.kilo;

/**
 *
 * @author SarahMiller
 */
public class Player {
    
    private final String name;
    private int score = 0;
    private int strikes = 0;
    
    public Player(String n)
    {
        name = n;
        
    }
    
    public String getPlayer()
    {
        return name;
    }
    
    public int getScore()
    {
    
        return score;
    }
    
    public int updateScore()
    {
        score = score+1;
        return score;
    }
    
    public int getStrikes()
    {
        return strikes;
    }
    
    public int updateStrikes()
    {
        strikes = strikes +1;
        if(strikes >= 3)
        {
            System.out.println("3 Strikes, Game over!");
        }
        return strikes;
    }
    
}
