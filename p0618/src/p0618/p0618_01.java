package p0618;

import java.util.Scanner;

public class p0618_01 {

    public static void main(String[] args) {
        // 주민번호 앞자리를 입력받아 봄, 여름, 가을, 겨울인지 출력하기
        // 12-02월 : 겨울, 03-05월 : 봄, 06-08월 : 여름, 09-11월 : 가을
        Scanner scan = new Scanner(System.in);
        System.out.println("주민번호 입력하세요 >>");
        //1,2 1900년생이고 3,4 2000년생 2024-1988=36
        //3,4 2000 2024-2001 = 23
        String input = scan.nextLine();
        // 나이를 출력하는 프로그램
        
        //7, 0,2
        String flag = input.substring(7,8);
        String birthY = input.substring(0,2);
        int age = 0;
        
        if(flag.equals("1") || flag.equals("2")) {
        	age = 2024 - Integer.parseInt("19"+birthY);
        	
        }
        else if(flag.equals("3") || flag.equals("4")) {
        	age = 2024 - Integer.parseInt("20"+birthY);
        }
        
        
        
        
        
        
//        switch(flag) {
//        case "1" : case "2":
//        	age = 2024 - Integer.parseInt("19"+birthY);
//        	break;
//        	
//        case "3" : case "4":
//        	age = 2024 - Integer.parseInt("20"+birthY);
//        	break;
//        }
//        
//        System.out.println("당신의 나이 : "+age);
       
        
        
        
//        if (input.length() != 6) {
//            System.out.println("잘못된 입력입니다. 주민번호 앞자리 6자리를 입력해야 합니다.");
//            return;
//        }
//        
//        String birthMonth = input.substring(2, 4);
//        int month = Integer.parseInt(birthMonth);
//        
//        String season;
//        
//        switch (month) {
//            case 12:
//            case 1:
//            case 2:
//                season = "겨울";
//                break;
//            case 3:
//            case 4:
//            case 5:
//                season = "봄";
//                break;
//            case 6:
//            case 7:
//            case 8:
//                season = "여름";
//                break;
//            case 9:
//            case 10:
//            case 11:
//                season = "가을";
//                break;
//            default:
//                season = "잘못된 월입니다.";
//                break;
//        }
//        
//        System.out.println("입력 : " + input);
//        System.out.println("태어난 계절 : " + season);
    }
}
