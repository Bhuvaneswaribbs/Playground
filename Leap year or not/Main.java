import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
      if(((num%4==0)&&(num%100!=0))||((num%4==0)&&(num%400==0)))
                                      System.out.println("Leap year");
                                      else
                                      System.out.println("Non Leap year");
    }
}