package Com.to;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class Player {
	
	
@Id
private	int playerID;
private String playerName;
private String teamName;
private int age;

	public Player() {
		
	}
	
	
	



	public int getPalyeID() {
		return playerID;
	}



	public void setPalyeID(int palyeID) {
		this.playerID = palyeID;
	}



	public String getPlayerName() {
		return playerName;
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public String getTeamName() {
		return teamName;
	}



	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	
	


	public Player(int palyeID, String playerName, String teamName, int age) {
		super();
		this.playerID = palyeID;
		this.playerName = playerName;
		this.teamName = teamName;
		this.age = age;
	}






	@Override
	public String toString() {
		return "Player [playerID=" + playerID + ", playerName=" + playerName + ", teamName=" + teamName + ", age=" + age
				+ "]";
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

