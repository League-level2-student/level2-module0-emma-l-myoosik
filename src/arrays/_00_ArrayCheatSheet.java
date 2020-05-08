package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String arr[] = {"Economy", "Military", "Donald Trump", "China"};
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "Nuclear weapons";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (String wordsToSparkADebate: arr) {
			System.out.println(wordsToSparkADebate);
		}
		//6. make an array of 50 integers
		int arr2[] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int) (Math.random() * 51);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNum = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] < smallestNum) smallestNum = arr2[i];
		}
		System.out.println(smallestNum);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		//10. print the largest number in the array.
		int largestNum = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] > largestNum) largestNum = arr2[i];
		}
		System.out.println(largestNum);
	}
}
