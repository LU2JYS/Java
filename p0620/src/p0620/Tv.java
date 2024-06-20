package p0620;

public class Tv {
	//참조변수
	String color;
	boolean power;
	int channel;
	 
	//메소드
	void power() {
		power = !power;
	}
	void channelup() {channel++;}
	void channeldown() {channel++;}
}
