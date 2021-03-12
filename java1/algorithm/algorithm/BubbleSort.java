package algorithm;

public class BubbleSort {
		public static void main(String[] args) {
			System.out.println("5 개만 정렬을 해보도록 합시다. ");
			int[] Check = {5,4,3,2,1};
			System.out.println("정렬 전");
			System.out.println("    5    4    3    2    1");
			bubbleSort(Check);
		}

		public static void bubbleSort(int a[] ) {
			int size = a.length;
			for(int i=size-1; i>0; i--) {
				System.out.printf("\n버블 정렬 %d 단계 :", size-i);
				for(int j=0; j<i; j++) {
					if(a[j] > a[j+1]) {
						swap(a,j,j+1);
					}
					System.out.printf("\n\t");
					for(int v : a) {
						System.out.printf("%3d ", v);
					}
				}
			}
			System.out.println();
		}

		public static void swap(int a[] , int idx1, int idx2) {
			int temp = a[idx1];
			a[idx1] = a[idx1];
			a[idx2] = temp;
			
		}

}
