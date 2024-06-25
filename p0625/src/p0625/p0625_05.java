package p0625;

public class p0625_05 {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(12);
		t.day = 50;
		
		System.out.println("현재시간 : "+t.getHour());
		System.out.println("현재날짜 : "+t.day);
	}
}
