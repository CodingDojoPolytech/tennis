
public class Game {
	
	private Player p1;
	private Player p2;
	
	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Player getP1() {
		return p1;
	}

	public void setP1(Player p1) {
		this.p1 = p1;
	}

	public Player getP2() {
		return p2;
	}

	public void setP2(Player p2) {
		this.p2 = p2;
	}
	
	public void winPointP1(){
		winPoint(p1, p2);
	}
	
	public void winPointP2(){
		winPoint(p2, p1);
	}
	
	private void winPoint(Player winner, Player looser) {
		//TODO problem here !
		System.out.println("winner "+winner.hasAdvantage());
		System.out.println("winner "+winner.score);
		if(looser.hasAdvantage()){
			looser.setAdvantage(false);
		}
		else if(winner.hasAdvantage()){
			winner.winGame();
			winner.setAdvantage(false);
		}
		else if(winner.getScore().equals(Score.FORTY) && looser.getScore().equals(Score.FORTY) ){
			winner.setAdvantage(true);
		}
		else if(winner.getScore().equals(Score.FORTY) && looser.getScore().compareTo(Score.FORTY )==-1){
			System.out.println("won the game");
			
			
			winner.winGame();
		}
		else{
			winner.winPoint();
		}
	}
}
