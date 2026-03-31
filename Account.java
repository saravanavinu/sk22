import java.util.Scanner;
class Account
{
	Scanner sc=new Scanner(System.in);
	int initialBal;
	int deposit;
	int withdraw;
	public static void main(String[] args)
	{
		Account n=new Account();
		System.out.print("Enter your initial balance :");
		n.initialBal=n.sc.nextInt();
		
		System.out.print("Enter your deposit amount :");
		n.deposit=n.sc.nextInt();
		
		n.initialBal=n.initialBal+n.deposit;
		System.out.print("Enter your withdraw amount :");
		
		n.withdraw=n.sc.nextInt();
		n.initialBal=n.initialBal-n.withdraw;
		System.out.println("Balance :"+n.initialBal);
	}
}