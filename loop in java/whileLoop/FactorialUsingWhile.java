//Java Program to find factorial of a number using while loop
class FactorialUsingWhile{
	public static void main(String[] args) {
		int factorial=1;
		int number=6;
		int i =1;
		while(i<=number){
			factorial*=i;
			i++;
		}

		System.out.println("factorial of number "+number+ " is " + factorial);
	}
}