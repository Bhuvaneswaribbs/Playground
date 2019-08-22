import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int first_dig=num/100;
      int three_dig=num%10;
      int Sum=first_dig+three_dig;
      System.out.println(Sum);
	}
}