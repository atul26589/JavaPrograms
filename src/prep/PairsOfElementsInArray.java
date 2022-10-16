package prep;

import java.util.Arrays;

public class PairsOfElementsInArray {

	public static void findThePairs(int inputArray[], int inputNumber) {

		Arrays.sort(inputArray);
		System.out.println("Pair of Elements whose sum is" + inputNumber + "are:");
		// Intializing i to 1st Index:

		int i = 0;

		// Intializing j to last Index:

		int j = inputArray.length - 1;

		// Till i crosses j perform the task

		while (i < j) {
			if (inputArray[i] + inputArray[j] == inputNumber) {
				System.out.println(inputArray[i] + "+" + inputArray[j] + "=" + inputNumber);
				i++;
				j--;
			}
			// If inputArray[i]+inputArray[j] is smaller than inputNumber
			else if (inputArray[i] + inputArray[j] < inputNumber) {
				i++;
				// If inputArray[i]+inputArray[j] is smaller than inputNumber
			} else if (inputArray[i] + inputArray[j] > inputNumber) {
				j--;
			}
		}

	}

	public static void main(String[] args) {
		findThePairs(new int[] {12,23,45,13,34,67,89,90,56,51,53}, 80);
		
		findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 30);
	}

}
