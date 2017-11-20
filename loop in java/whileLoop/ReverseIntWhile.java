//Java Program to reverse an integer using while loop
class ReverseIntWhile{
	public static void main(String[] args) {
		int num = 559;
		int reverse=0;
		int temp=num;
		while (num !=0){
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
			
		}
		System.out.println("Reverse of " +temp+ " is " + reverse );
	}
}