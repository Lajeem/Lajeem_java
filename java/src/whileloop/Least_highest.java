package whileloop;

public class Least_highest
{
    public static void main(String args[])
    {
      Least_highest obj=new Least_highest();
                  obj.least();
                  obj.highest();
                  obj.triple_least();
                  obj.triple_highest();
     }
        public void least()
        {
        int a=3;
        int b=6;
        int large=a>b ? a:b;  // ternary operator
        while( true)
        {
        if(large%a ==0 && large%b ==0)
        {
        System.out.println("least number="+large);
        break;
        }
        large++;
        }
        }


            public void highest()
            {
            int a=8;
            int b=16;
            int i=1;
            int hcf=0;
            int small =a>b ? b:a;
            while (small>=i)
            {
            if (a%i==0 &&  b%i==0)
            {
            hcf=i;
            }
            i++;
            }
            System.out.println("Highest="+ hcf);   
            }



                                public void triple_least()
                                {
                                int a=7;
                                int b=15;
                                int c=25;
                                int d= a>b ? a:b;
                                int large= d>c ? d:c ;
                                int range=a*b*c;
                                while(large<=range)
                                {
                                if (large%a==0 && large%b==0 && large%c==0)
                                {
                                System.out.println( "Triple_least=" +large);
                                break;
                                }
                                large++;
                                }
                                }
                

                                                    public void triple_highest()
                                                   {
                                                   int a=12;
                                                   int b=24;
                                                   int c=36;
                                                   int i=1;
                                                   int hrf=0 ;
                                                   int d=a>b ? a:b ;
                                                   int small= d>c ? d:c ;
                                                   while(small>=i)
                                                   {
                                                   if (a%i==0 && b%i==0 && c%i==0)
                                                   {
                                                   hrf=i;
                                                   }
                                                   i++;
                                                   }
                                                   System.out.println("triple_highest="+ hrf);
                                                   }
}
                                                                                                    






                
                







            
        
