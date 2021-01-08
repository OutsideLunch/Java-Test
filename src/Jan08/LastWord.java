package Jan08;

import java.util.Scanner;

public class LastWord {
	Scanner sc = new Scanner(System.in);
	public String name;
	public String word;
	
	public String writeWord() {
		word = sc.next();
		return word;
	}
	
	public boolean correct(char lastChar) {
		if (lastChar == word.charAt(0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		String startWord = "겨울한파";
		
//		System.out.println("끝말잇기 게임을 시작합니다.");
//		System.out.print("게임에 참가하는 인원은 몇 명입니까? >> ");
//		int people = sc.nextInt();
//		
//		LastWord[] game = new LastWord[people];
//		
//		for(int i = 0; i < people; i++) {
//			System.out.print("참가자의 이름을 입력하세요 >> ");
//			game[i] = new LastWord();
//			game[i].name = sc.next();
//		}
//		
//		System.out.println("시작하는 단어는 겨울한파 입니다.");
		
//		int j = 0;
		while(true) {
			System.out.println("끝말잇기 게임을 시작합니다.");
			System.out.print("게임에 참가하는 인원은 몇 명입니까? >> ");
			int people = sc.nextInt();
			
			LastWord[] game = new LastWord[people];
			
			for(int i = 0; i < people; i++) {
				System.out.print("참가자의 이름을 입력하세요 >> ");
				game[i] = new LastWord();
				game[i].name = sc.next();
			}
			
			System.out.println("시작하는 단어는 겨울한파 입니다.");
			int j = 0;
			
			while(true) {
				int lastIndex = startWord.length()-1;
				char lastChar = startWord.charAt(lastIndex);
				
				System.out.print(game[j].name + " >> ");
				game[j].writeWord();
				boolean nextPlayer = game[j].correct(lastChar);
				if (nextPlayer == false) {
					System.out.println(game[j].name + "이 졌습니다.");
					break;
				}
				startWord = game[j].word;
				j++;
				if (j >= game.length) {
					j = 0;
				}
				
			}
			System.out.println("다시 시작하시겠습니까?(y/n)");
			String continuing = sc.next();
			
			if (continuing.equals("y")) {
				continue;
			} else if (continuing.equals("n")) {
				break;
			} 
		
		}
		System.out.println("끝말잇기 프로그램을 종료합니다.");
		
	}

}
