//Program to print even number from 10 to 20.
class WhileExample2{
	public static void main(String[] args) {
		int from=10;
		int to=20;
		int loopControl=from;

		while(loopControl<=to){
			if (loopControl%2==0)
				System.out.println("Even numbers between 10 to 11 are - "+loopControl);
			loopControl++;
		}
		
	}
}