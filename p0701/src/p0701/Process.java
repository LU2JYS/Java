package p0701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class  Process {
//	List<Card> list = new ArrayList();
	
	ArrayList<Card> clist = new ArrayList();
	ArrayList<Students> slist = new ArrayList();
	
	// card list보내기
	ArrayList<Card> clistAdd(){ //인스턴스 메소드
		clist.add(new Card(1,"CLOVER"));
		clist.add(new Card(2,"CLOVER"));
		clist.add(new Card(3,"CLOVER"));
		clist.add(new Card(4,"CLOVER"));
		clist.add(new Card(5,"CLOVER"));
		return clist;
	}
	
	// Students list 보내기
	ArrayList<Students> slistAdd(){
		slist.add(new Students("홍길동",100,90,95));
		slist.add(new Students("유관순",100,90,95));
		slist.add(new Students("이순신",100,90,95));
		slist.add(new Students("김구",100,90,95));
		slist.add(new Students("강감찬",100,90,95));
		
		return slist;
	}
	
	//2개를 모두 보내기
	HashMap<String, Object> listAdd() {
//		Map<String, Object> map = new HashMap<String, Object>();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("clist",clistAdd());
		map.put("slist",slistAdd()); //두개를 보낼때 map을 보낸다..
		
		return map;
	}
}
