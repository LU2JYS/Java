package p0701;

import java.util.ArrayList;
import java.util.Comparator;

import p0701.Card;

public class p0701_02 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList();
		
		list.add(new Card(1,"CLOVER"));
		list.add(new Card(10,"HEART"));
		list.add(new Card(10,"SPADE"));
		//list를 출력하세요.
		for (int i = 0; i < list.size(); i++) {
//            Card c= (Card) list.get(i);
//            System.out.println(list.get(i).getkind()+","+list.get(i).getNumber());
            System.out.println(list.get(i));
	}
}
}