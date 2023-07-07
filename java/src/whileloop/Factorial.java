package whileloop;

class Factorial
{
public static void main(String args[])
    { 
    Factorial obj= new Factorial();
              obj.number();
    }
        public void number()
        {
        int n=6;
        int fact=1;
        int i=1;
        while (n>=i)
        {
        fact=fact*n;
        }
        n--;
        System.out.println(fact);
        }
}
