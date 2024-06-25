package p0625;

public class Deck {
	//1,2,3,4,.....11-j,12-q,13-k <13*4 = 52장>
	Card[] c = new Card[52]; //배열 선언 52개의 카드가 만들어짐
	Card[] cc = new Card[5];
	String[] shape = {"SPADE","DIAMOND","HEART","CLOVER"};
	int count=0;
	
	Deck() {
		//기본생성자
		for(int i=0; i<52;i++) {
			c[i] = new Card(i%13+1,shape[i/13]); //Card this에 넣어준다.
//			
		}
	}
	
	//카드섞기 메소드
	void shuffle() {
		for (int i=0; i<300; i++) {
			int random = (int)(Math.random()*52); //0-51
			Card temp = c[0];
			c[0] = c[random];
			c[random]= temp;
		}
	}
	Card pick() {
		Card card = c[count];
		count++;
		return card;
	}
	Card pick(int n) {
		return c[n];
	}
	Card pick5() {
		for (int i = 0; i < 5; i++) {
            cc[i] = c[count++];
        }
		return cc;
	}
}
