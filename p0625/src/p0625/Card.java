package p0625;

public class Card {
	
	Card(){}
	Card(int number,String kind){
		this.number=number;
		this.kind=kind; //생성자를 만들면 알아서 넣어줄께
	}
	
	int number;
	String kind;
	
	public String toString() {
		
		
		return "["+kind+","+number+"]";
	}
	
	
}
