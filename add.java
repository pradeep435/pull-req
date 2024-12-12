import java.util.Scanner;
class add
{
 public static void main(String args[])
  {
    Scanner myobj = new Scanner(System.in);
    System.out.println("enter first number:");
    int firstnumber;
    firstnumber=myobj.nextInt();
    System.out.println("enter second number:");
    int secondnumber;
    secondnumber=myobj.nextInt();
    System.out.println("Firstnumber:"+firstnumber);
    System.out.println("Secondnumber:"+secondnumber);
  }
}