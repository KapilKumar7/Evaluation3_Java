package question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter the number of elements in the array");

			int n = scanner.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				System.out.println("Enter the elements in the array");
				arr[i] = scanner.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int i = scanner.nextInt();
			System.out.println("The array element at index " + i + " =" + arr[i]);

		} catch (InputMismatchException e) {

			System.out.println("java.lang.NumberFormatException");
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("java.lang.ArrayIndexOutOfBoundsException");

		}
		System.out.println("The array element successfully accessed");

	}

}
