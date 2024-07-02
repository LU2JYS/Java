package p0701;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_C {

	public static void main(String[] args) {
		String str = "S0001,이순신,100,100,100,300,100.0,0,0\r\n";
		str += "S0002,유관순,80,80,80,240,80.0,0,0\r\n";
		str += "S0003,강감찬,60,60,60,180,60.0,0,0\r\n";
		try{
			FileWriter fw = new FileWriter("c:/save/abc.txt",true);
			BufferedWriter bw = new BufferedWriter(fw); //1줄씩 가져오기
			bw.write(str);
			bw.close();
			
		}catch (IOException e) {e.printStackTrace();}
		
		
		System.out.println("파일에 내용을 저장했습니다.");
			
	}
}
