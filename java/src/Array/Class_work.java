package Array;

import java.util.Scanner;

public class Class_work {
	
	static void myArray() {
		
		int arr[]= { 1,2,3,4,5,6,7,8,9,10};
		System.out.println();
		for(int i=0;i<arr.length;i++) 
        {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	static void userArray() {
		
		//int size = sc.
		int arr[]= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the array elements");
		
		/*
		 * arr[0]= sc.nextInt(); arr[1]= sc.nextInt(); arr[2]= sc.nextInt(); arr[3]=
		 * sc.nextInt(); arr[4]= sc.nextInt();
		 */
	for(int i=0;i<arr.length;i++) {
		
		arr[i]= sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
	
	
	public static void main(String[] args) {

		double []arr= new double[10];//int array object creation;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		/*
		 * arr[0]=5; arr[1]= 6; arr[2]= 7; arr[3]= 8; arr[4]= 9;
		 */
		int j=1;
		
		for(int i=0;i<arr.length;i++) {
		
			arr[i]=j;
			j+=2;
			
		}
		
		System.out.println("After initialisation");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//myArray();
		userArray();
	}

}