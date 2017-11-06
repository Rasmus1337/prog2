package array.exersices;

import java.util.Arrays;

public class ArrayApplication {

	public static void main(String[] args) {
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456, 2, 3213 };
		String[] my_array2 = { "Java", "Python", "PHP", "C#", "C Programming", "C++" };

		// Uppgift 1
		Arrays.sort(my_array1);
		Arrays.sort(my_array2);

		System.out.println(Arrays.toString(my_array1));
		System.out.println(Arrays.toString(my_array2));

		// Uppgift2
		int summanAvMyArray1 = 0;
		for (int i = 0; i < my_array1.length; i++) {
			summanAvMyArray1 += my_array1[i];
		}
		// Uppgift3
		System.out.println(summanAvMyArray1);
		char[][] charArray = new char[10][10];

		for (int row = 0; row < charArray.length; row++) {
			for (int col = 0; col < charArray[row].length; col++) {
				charArray[row][col] = '-';
				System.out.print(charArray[row][col] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		charArray[4][5] = 'D';
		charArray[0][0] = 'k';

		for (int row = 0; row < charArray.length; row++) {
			for (int col = 0; col < charArray[row].length; col++) {

				System.out.print(charArray[row][col] + " ");
			}
			System.out.println("");
		}
			//uppgift 4
		int[] numbers = new int[] { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457,
				2456 };

		int sum = 0;
		for (int i = 0; i < numbers.length; i++)
			sum = sum + numbers[i];
		double average = sum / numbers.length;
		System.out.println("Average value of the array elements is : " + average);

		int[] my_array3 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		System.out.println(contains(my_array3, 2013));

	}
			//uppgift 5 
	public static boolean contains(int[] arr, int item) {
		for (int n : arr) {
			if (item == n) {
				return true;
			}
		}
		return false;
	}

		//uppgift 7
	
}	
		