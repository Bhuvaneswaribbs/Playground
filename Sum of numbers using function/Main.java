import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      System.out.print(SumOfNumbers(n));
    }
  public static int SumOfNumbers(int y)
  {
    int sum=0;
    for(int i=1;i<=y;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
  
  
}


