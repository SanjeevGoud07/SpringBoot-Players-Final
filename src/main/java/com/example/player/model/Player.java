// Write your code here.
package com.example.player.model;
import javax.persistence.*;

@Entity
@Table(name="team")
public class Player{
    @Id
    @Column(name="playerid")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int playerId;
    @Column(name="jerseynumber")
    private int jerseyNumber;
    @Column(name="playername")
    private String playerName;
    @Column(name="role")
    private String role;

    public Player(){}
    public Player(int id,String name,int jersey,String role){
        playerId=id;
        jerseyNumber=jersey;
        playerName=name;
        this.role=role;
    }
    public int getPlayerId(){
        return playerId;
    }
    public int getJerseyNumber(){
        return jerseyNumber;
    }
    public  String getPlayerName(){
        return playerName;
    }
    public String getRole(){
        return role;
    }
    public void setPlayerId(int id){
        playerId=id;
    }
    public void setJerseyNumber(int jersey){
        jerseyNumber=jersey;
    }
    public void setPlayerName(String name){
        playerName=name;
    }
    public void setRole(String role){
        this.role=role;
    }
}