package pkg;

import java.util.Scanner;

public class Main {
	public int solution(String str, char ch) {
		int answer = 0;
		
		str = str.toLowerCase();
		ch = Character.toLowerCase(ch);
		
		for(char x : str.toCharArray()) {
			if(x == ch) answer++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char ch = sc.next().charAt(0);
		System.out.println(T.solution(str, ch));
 
	}

}
