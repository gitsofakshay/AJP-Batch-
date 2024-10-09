import java.util.Scanner;
class CalculateBonus{
  public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int salary = 20000;
	System.out.print("Enter Experience: ");
	int exp = sc.nextInt();
	double bonus = exp >= 20 ? (20000*20)/100 : (20000*10)/100;
	System.out.println("The total salary is "+ bonus);
  }
}
