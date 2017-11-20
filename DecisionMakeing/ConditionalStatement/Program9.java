//conditional statement for number is even or odd.
import java.util.Scanner;
class Program9EvenOdd{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner (System.in);
		System.out.print("Enter a number to know even or odd - ");
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println("This number "+num+" is an even number");
		}
		else{
			System.out.println("This number "+num+" is an odd number");
		}
	}
}