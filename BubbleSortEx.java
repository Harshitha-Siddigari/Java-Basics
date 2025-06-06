package javaproject1;

public class BubbleSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {5,2,4,1,3};
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		System.out.println("sorted List");
		for(int num:numbers) {
			System.out.println(num+" ");
			
		}

	}

}
