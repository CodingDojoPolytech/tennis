
public enum Score {
	LOVE(0),
	FIFTEEN(15),
	THIRTY(30),
	FORTY(40);
	
	int value;
	Score(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
