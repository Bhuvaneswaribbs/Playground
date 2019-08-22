import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(SquareOfANumber(n));
    }
  public static int SquareOfANumber(int a)
  {
    int result=a*a;
    return result;
  }
  
	} 
