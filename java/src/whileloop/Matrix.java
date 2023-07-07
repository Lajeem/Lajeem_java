package whileloop; 

public class Matrix
{
    public static void main(String args[])
    {
       Matrix obj=new Matrix();
              obj.sum();
              obj.even();
              obj.reverse();
    }
        public void sum()
        {
        int row = 1;
        while(row<4)
        {
        int column = 1;
        while(column<6)
        {
        System.out.print(row +" ");
        column++;
        }
        row++;
        System.out.println("");
        }
        }



    
                public void even()
                {
                int row =1;
                while(row<4)
                {
                int column = 2;
                while(column<11)
                {
                System.out.print(column +" ");
                column = column+2;
                }
                row++;
                System.out.println();
                }
                }
                    

                    public void reverse()
                    {
                    int row =4;
                    while(row<=1)
                    {
                    int column=1;
                    while(column<=4)
                    {
                     System.out.print (row + " ");
                     column=column++;
                    }
                    row--;
                    System.out.println(" ");
                    }
                    }
}
            

                





     
