package Array_2D;

public class Jagged_array 
{
	public static void main(String args[])
		{
			Jagged_array obj=new Jagged_array ();
					     obj.number();
					    // obj.number1();
		}
	
	void number()
	{
		//int a[][]= {{1,2},{3,4,5},{6}};
		
		int a[][]=new int [3][];
									// its Jagged array so we put the row length only, column length can be differ 
		a[0]=new int [2];		    // so use the single dimensional array
	    a[1]=new int [3];
    	a[2]=new int [1];
    	int temp=1;
    	
    	System.out.println("The given array is Jagged element");
    	
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a[i].length;j++)
    		{
    			a[i][j]=temp;
    			temp++;
    		}
    	}
    		for(int i=0;i<a.length;i++)
        	{
        		for(int j=0;j<a[i].length;j++)
        		{
        			System.out.print(a[i][j]+" ");
        		}
        		System.out.println();
        	}
		 
	}
	void number1()     // sum of the 2 jagged array in another array
	{
		int a[][]=new int [3][];
		
		a[0]=new int [2];
		a[1]=new int [3];
		a[2]=new int [1];
		
      int b[][]=new int [3][];
		
		b[0]=new int [2];
		b[1]=new int [3];
		b[2]=new int [1];
		
		int c[][]=new int [3][];
		c[0]=new int [2];
		c[1]=new int [3];
		c[2]=new int [1];
		
		
		System.out.println("Sum of the given 2 jagged array" );
		int temp=1;
		
		for(int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a[i].length;j++)
    		{
    			a[i][j]=temp;
    			temp++;
    		}
    	}
		int l=1;
		for(int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a[i].length;j++)
    		{
    			b[i][j]=l;
    			l++;
    		}
    	}
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a[i].length;j++)
    		{
    			c[i][j]=a[i][j]+b[i][j];
    			
    		}
    	}
    	// display 
    		for(int i=0;i<a.length;i++)
        	{
        		for(int j=0;j<a[i].length;j++)
        		{
        			System.out.print(c[i][j]+" ");
        		}
        		System.out.println();
        	}
	}

}
