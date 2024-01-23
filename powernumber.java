class appi
{
public static void main(String args[])
{ 
    int num=132,sum=0,product=1;
    while(num>0)//132>=0
    {
     sum=sum+num%10;//0+132%10//2
     product=product*(num%10);//1*10//10
     num/=10;//132/10//13
     }
       if(sum==product)
         System.out.println("power number");
        else
          System.out.println("Not power number");
}
}
  