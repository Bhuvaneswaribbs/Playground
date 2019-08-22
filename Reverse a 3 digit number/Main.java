import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int first_dig=num/100;
    int sec_dig=(num%100)/10;
    int last_dig=num%10;
    int Reverse_num=(last_dig*100)+(sec_dig*10)+first_dig;
    System.out.println(Reverse_num);
  }
}