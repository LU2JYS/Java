package p0701;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class p0701_06_inputstream {

	public static void main(String[] args) throws Exception{
		
		//기본적인 인풋스트림 형태
		try {
			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
			int read = 0; //파일 읽어오기
				while((read = fis.read())!= -1) {
					System.out.println((char)read);
				} 
			} catch (Exception e) {e.printStackTrace();}
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			int read = 0; //파일 읽어오기
//			try {
//				
//				while((read = fis.read())!= -1) {
//					System.out.println((char)read);
//				} 
//			}catch(IOException e) {e.printStackTrace();}
//			
//			} catch (FileNotFoundException e) {e.printStackTrace();}		
//		byte[] b = new byte[1024];
//		try {
//		FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//		fis.read(b); //파일 읽어오기
//		System.out.println(new String(b));
//		
//		} catch (Exception e) {e.printStackTrace();}
		}		
	}

