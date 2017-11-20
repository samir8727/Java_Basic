//Java Program to print that are Equivalent to the unicodes from 33 to 122 in a single line
class UnicodeWhile {
	public static void main(String[] args) {
		int from = 33;
		int to= 122;
		while(from<=to){
			System.out.print((char)from++ +"\t"); //t is use here for tab Escape Sequence
		}

	}
}