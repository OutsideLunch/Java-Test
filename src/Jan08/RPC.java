package Jan08;

import java.util.Scanner;
import java.util.Random;

public class RPC {

	public static void main(String[] args) {
		int a;
		int value = 0;
		String rString;
		Random random = new Random();
		a = random.nextInt(3);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >> ");
		
		rString = sc.nextLine();
		
		if (rString.equals(0)) {
			rString = "가위";
		} else if (rString.equals(1)) {
			rString = "바위";
		} else if (rString.equals(2)) {
			rString = "보";
		}
		
		if (a == 0) {
			System.out.println("영희 >> 가위");
		} else if (a == 1) {
			System.out.println("영희 >> 바위");
		} else if (a == 2) {
			System.out.println("영희 >> 보");
		}
		
		switch (rString) {
		case "가위":
			if (a == 0) {
				System.out.println("비겼습니다.");
			} else if (a == 1) {
				System.out.println("영희가 이겼습니다.");
			} else if (a == 2) {
				System.out.println("철수가 이겼습니다.");
			}
			break;
		case "바위":
			if (a == 0) {
				System.out.println("철수가 이겼습니다.");
			} else if (a == 1) {
				System.out.println("비겼습니다..");
			} else if (a == 2) {
				System.out.println("영희가 이겼습니다.");
			}
			break;
		case "보":
			if (a == 0) {
				System.out.println("영희가 이겼습니다.");
			} else if (a == 1) {
				System.out.println("철수가 이겼습니다.");
			} else if (a == 2) {
				System.out.println("비겼습니다.");
			} 
			break;
		default : 
			System.out.println("잘못 입력했습니다.");
		}
	}

}



















