import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner (System.in);
      int num=in.nextInt();
      if(num>=85)
        System.out.println("A");
      else if(num>=75)
        System.out.println("B");
      else if(num>=65)
      System.out.println("C");
      else if(num>=55)
        System.out.println("D");
      else
        System.out.println("Fail");
    }
}