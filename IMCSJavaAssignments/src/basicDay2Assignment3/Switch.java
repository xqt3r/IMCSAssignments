package basicDay2Assignment3;

import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);
		switch (Character.toUpperCase(grade)) {
		case 'A':
			System.out.println("80-100");
			break;
		case 'B':
			System.out.println("73-80");
			break;
		default:
			System.out.println("grade does not exist");
			break;
		}
	}
}
