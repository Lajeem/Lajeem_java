package Array_2D;

public class Transpose_the_array 
{
public static void main(String args[])
{
	Transpose_the_array obj=new Transpose_the_array ();
						obj.transpose();
						obj.number1();
}
void transpose()   //transpose the given array (A)T
{																				// Given Input:
	int a[][]= {{1,2,3,4,5},{7,8,4,5,6},{4,5,7,8,9},{9,6,5,2,3},{2,5,8,7,9}};	//		 12345
																				//		 78456
	int b[][]=new int[a.length][a[0].length];									//		 45786
																				//		 96523	
	System.out.println("Transpose of the given element");						//		 25879  
																			
	for(int i=0;i<a.length;i++)													// exp output : 17492
	{																						//  28565
		for(int j=0;j<a[i].length;j++)														//  34758
		{				                                                                    //  45827
			b[i][j]=a[j][i]; 																//  56639
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
}
				//transpose and it stored in same array
	void number1()
	{
		int a[][]= {{1,2,3,4,5},{7,8,4,5,6},{4,5,7,8,9},{9,6,5,2,3},{2,5,8,7,9}};	
		
											
					
			System.out.println("Stored in the same the given array");					
				
			for(int i=0;i<a.length;i++)													
			{																						
				for(int j=0;j<a[0].length;j++)													
				{	
				int temp= a[i][j]; 
				a[i][j]=a[j][i]; 
				a[j][i]=temp;
				}
			}
				for(int i=0;i<a.length;i++)													
				{																						
					for(int j=0;j<a[0].length;j++)													
					{	
						System.out.print(a[j][i]+" ");
					}
				  System.out.println();
				}
	}
}
						
		
		
		
		
		
		
		
		
		

		
		
		


