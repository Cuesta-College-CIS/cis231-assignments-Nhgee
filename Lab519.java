import java.util.Scanner;

public class Lab519 {
	public static void main(String[] args) {
		int length = 5;
		int[] numbers = { 5, 20, 30, 35, 50, 0, 0, 0, 0, 0 };
		int insert_value;
		int idx = 0;

		Scanner scnr = new Scanner(System.in);
		insert_value = scnr.nextInt();

		for (int j = 0; j < length; j++) {
			// Think of this code.
			// I am going to comment out the below line, move to out of for loop
			// idx = j;
			if (insert_value < numbers[j]) {
				break;
			}
		}

		// Afer the full iteration of for loop, j is the length. In this example, 5.
		idx = j;

		for (int k = length - 1; k >= idx; k--) {
			numbers[k + 1] = numbers[k];
		}
		numbers[idx] = insert_value;

		for (int l = 0; l <= length; l++) {
			System.out.print(numbers[l] + " ");
		}
		System.out.println();
		scnr.close();
	}

}