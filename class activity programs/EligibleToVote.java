import java.util.Scanner;
class EligibleToVote{
  public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age: ");
	short age = sc.nextShort();
	String result = (age>=18) ? "Eligible to Vote" : "Not eligible to vote";
	System.out.println(result);
  }
}