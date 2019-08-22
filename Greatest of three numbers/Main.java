import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
      int num1=in.nextInt();
      int num2=in.nextInt();
      int num3=in.nextInt();
      if(num1>num2)
       {if(num1>num3)
          System.out.println("78");
        else
          System.out.println("num3 greater");
       }
      else
      {  if(num2>num3)
        System.out.println("num2 greater");
       else
         System.out.println("10");
      }
    }
}