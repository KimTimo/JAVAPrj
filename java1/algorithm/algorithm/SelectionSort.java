package algorithm;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5 개만 정렬을 해보도록 합시다. ");
		int[] Check = {5,4,3,2,1};
		System.out.println("정렬 전");
		System.out.println("  5  4  3  2  1");
		selectionSort(Check);	
	}
	static void selectionSort(int [] list) {
		int indexMin, temp;
		
		for (int i = 0; i < list.length -1; i++) {
			System.out.println((i+1) + " 번째 선택 정렬");
			for (int j = i + 1; j < list.length; j++) {
				if(list[i] > list[j]) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
				for(int v : list) {
					System.out.printf("%3d ", v);
				}
				System.out.println();
			}
		}
	}

}
