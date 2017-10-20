//Bellow age 18 are not Eligible for vote
import java.util.Scanner;
class EligibleForVote {
	public static void main(String[] args){
		Scanner sc;
		sc=new Scanner (System.in);
		System.out.print("Enter a age to know Eligibility for do vote - ");
		int age = sc.nextInt();
		boolean isEligibleToVote = age > 18 ;

		System.out.println(isEligibleToVote);

	}
}