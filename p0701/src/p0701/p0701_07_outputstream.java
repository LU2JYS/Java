package p0701;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class p0701_07_outputstream {

	public static void main(String[] args) throws Exception {
		//주로 로그파일저장할때 사용된다..
		try {
			//1byte 씩 저장
			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
			String str = "S0001,홍길동 ,100,100,100,300,100.0,0,0\r\n";
			str += "S0002,유관순,50,50,50,150,50.0,0,0\r\n";
			byte[] bytes = str.getBytes();
			for(byte b : bytes) { //단순for문
				 fos.write(b);
			}
//			
		 catch (Exception e) {
			e.printStackTrace();
		}System.out.println("파일에 글이 들어갔습니다.");
			
		//파일 생성, 폴더 생성
//		String str="c:/save1";
//		File folder = new File(str);
//		File file = new File(str+"/11.txt");
//		try {
//			if(!(folder.exists())) { //파일확인할때 exists() 한다.
//				System.out.println("폴더를 생성하였습니다.");
//				folder.mkdirs(); //폴더생성
//			}
//			file.createNewFile(); //		
//	}	catch(IOException e) {
//			e.printStackTrace();
//	}
//	System.out.println("파일이 생성되었습니다.");
		}
	}
}
	
