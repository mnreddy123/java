package sep_05;
import java.util.Scanner;
class BinarySearchRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int n = sc.nextInt();
		int arr[] = new int[n];   //  create an empty array
		// int arr[] = { 2, 3, 4, 5, 8, 9, 10, 22, 33 };
		System.out.println("enter array elements in sorting order:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("your array elements are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("enter which number you want to search:");
		int x = sc.nextInt();
		// int x = 3;
		int result = binarySearch(arr, x);
		if (result == -1) {
			System.out.println("element not found");
		} else {
			System.out.println("element found " + result);
		}
	}

	static int binarySearch(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		// int mid = (low + high) / 2;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return mid;
			}
			if (x > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
