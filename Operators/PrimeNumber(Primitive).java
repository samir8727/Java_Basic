//Prime Number
import java.util.Scanner;
class Prime{
	public static void main(String[] args){
		int i;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter a number to check Prime = ");
		i=sc.nextInt();
		boolean isPrimeNumber=(i%2==0);
		System.out.println(isPrimeNumber);
		

	}

}