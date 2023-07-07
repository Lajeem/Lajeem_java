package whileloop;

class Grade
{
public static void main(String args[])
    {
      Grade obj=new Grade();
            obj.marks('S');
            obj.marks('A');
            obj.marks('B');
            obj.marks('C');
            obj.marks('D');
            obj.marks('E');
            obj.marks('Z');
     }
        public void marks(char n)
        {
        switch(n)
         {
        case 'S':
           {
            System.out.println(n + " The given marks is90 to 100:");
            break;
           }
        case 'A':
            {
            System.out.println(n +" The given marks is 80 to 89:");
            break;
            }
        case 'B':
            {
            System.out.println(n + " The given marks is 70 to 79:");
            break;
            }
        case 'c':
            {
            System.out.println(n + " The given marks is 60 to 69:");
            break;
            }
        case 'D':
            {
            System.out.println(n + " The given marks is 50 to 59:");
            break;
            }
        case 'E':
            {
            System.out.println(n + " The given marks is 0 to 49:");
            break;
            }
        default:
            {
            System.out.println(n+ " The given marks is invalid:");
            }
       }  
     }
}



