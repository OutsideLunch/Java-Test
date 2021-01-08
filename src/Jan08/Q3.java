package Jan08;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		
		switch (in) {
		case "가위": 
			System.out.println(1);
			break;
		case "바위":
			System.out.println(2);
			break;
		case "보":
			System.out.println(3);
			break;
		default :
			System.out.println(0);
		}
			
//		if (in.equals("가위")) {
//			System.out.println(1);
//		}
//		else if(in.equals("바위")) {
//			System.out.println(2);
//		}
//		else if(in.equals("보")) {
//			System.out.println(3);
//		}
//		else {
//			System.out.println(0);
//		}	
		
	}

}
