//to know number is even or not
import java.util.Scanner;
class EvenNumber{
	public static void main (String[] args ){
		Scanner sc;
		sc=new Scanner (System.in);
		System.out.print("please enter a even nunmber - ");
		int num = sc.nextInt();
		boolean isEvenNumber = num%2==0 ;
		System.out.println(isEvenNumber);
	}
}