
public class Player {

	 Boolean advantage;
	 Score score;
	 int setWon;
	 int gameWon;
	
	public Player(){
		this.setAdvantage(false);
		score = Score.LOVE;
	}
	
	
	
	public int getSet() {
		return setWon;
	}

	public void setSet(int set) {
		this.setWon = set;
	}
	
	public void winGame() {
		gameWon++;
	}

	public int getGameWon() {
		return gameWon;
	}
	
	public Boolean hasAdvantage() {
		return advantage;
	}
	public void setAdvantage(Boolean advantage) {
		this.advantage = advantage;
	}
	
	public Score getScore(){
		return score;
	}
	
	
	public void winPoint(){
		switch(score){
			case LOVE:
				score = Score.FIFTEEN;
				break;
			case FIFTEEN :
				score = Score.THIRTY;
				break;
			case THIRTY:
				score = Score.FORTY;
				break;
			case FORTY:
				//please do stuff
				break;
		}
	}
}
