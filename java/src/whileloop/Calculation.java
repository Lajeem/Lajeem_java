package whileloop;

class Calculation
{
public static void main(String args[])
    {
     Calculation obj=new Calculation();
     int add =obj.number();
     System.out.println("add_total: "+add);

     int multi =obj.mul( add);
       System.out.println("mul_total:"+multi);
 
      int div =obj.div(add,multi);
       System.out.println("div_total:"+div); 
      
      int sub = obj.subtraction(div,add);
      System.out.println("sub_total="+sub);        
     }
        public int number()
        {
         int num1=20;
         int num2=40;    
         int add_total=num1+num2;
         return add_total;
         }
            public int mul(int add_total)
            {
             int mul_total = 5*add_total;
             return mul_total;
             }
             public int div(int add_total,int mul_total)
             {
              int div_total = add_total/10+mul_total;
              return div_total;
              }
              public int subtraction(int div_total,int add_total)              
              {
              int subtraction =div_total-add_total;
              return subtraction;
              }
}


  
    
