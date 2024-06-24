package p0624;

public class Car {
	static	int count = 0;
	int serial_no;
	 String color;
	 String gearType;
	 int door;
 
	 {
		 count +=1;
		 this.serial_no ="HD"+String.format("%04d",count);
	 }
	 
	 Car(){}//기본생성자
	 
	 Car(String color){
		 this.color=color;
	 }
	 
	 Car(String color, String gearType, int door){
		 this.color = color;
		 count+=1;
		 this.gearType = gearType;
		 this.door=door;
		 count +=1;
		 this.serial_no =count;
	 }
}
