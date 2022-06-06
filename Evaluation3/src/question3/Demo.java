package question3;

import java.util.Scanner;

public class Demo {
	static void showDetails(Month m) {

		switch (m) {
		case JAN:
			System.out.println("This is the 1st Month of the Year January");
			break;
		case FEB:
			System.out.println("This is the 2nd Month of the Year Feb");
			break;
		case MAR:
			System.out.println("This is the 3RD Month of the Year March");
			break;
		case APR:
			System.out.println("This is the 4RTH  Month of the Year Aprail");
			break;
		case MAY:
			System.out.println("This is the 5th Month of the Year May");
			break;
		case JUN:
			System.out.println("This is the 6th Month of the Year Jun");
			break;
		case JUL:
			System.out.println("This is the7th Month of the Year Jul");
			break;
		case AUG:
			System.out.println("This is the 8th Month of the Year Aug");
			break;
		case SEP:
			System.out.println("This is the 9th Month of the Year Sep");
			break;
		case OCT:
			System.out.println("This is the 10th Month of the Year Oct");
			break;
		case NOV:
			System.out.println("This is the 11th Month of the Year Nov");
			break;
		case DEC:
			System.out.println("This is the 12th Month of the Year Dec");
			break;

		}

	}

	public static void main(String[] args) {
		System.out.println("Input month: -");
		Scanner scanner = new Scanner(System.in);

		String mString = scanner.next();

		try {
			Month m1 = Month.valueOf(mString);
			showDetails(m1);

		} catch (Exception e) {
			System.out.println("Invalid Month Name");
		}

	}

}
