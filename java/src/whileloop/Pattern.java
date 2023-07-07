package whileloop;

class Pattern
{
    public static void main(String args[])
    {
        Pattern obj=new Pattern();
                obj.number();  
    }
        public void number()
        {
        int row = 1;
        while(row<=5)
        {
            int column= 5;
            while(column>=1)
            {
            if (row==column )
            {
            System.out.print("0 ");
            }
            else
            {
            System.out.print("* ");
            }
            column--;
            }
            row++;
            System.out.println();
         }
        }
}

