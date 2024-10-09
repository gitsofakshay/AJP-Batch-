import java.util.Scanner;

class CharDemo{
  public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a Unicode number: ");
	int ch = sc.nextInt();
	System.out.println("Char : " + (char)ch);
	
	System.out.println("Enter a character: ");
	char ch1 = sc.next().charAt(0);
	System.out.println("The unicode is : " + (int)ch1);
  }
}
