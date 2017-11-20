class TrickyWhile3{
	public static void main(String[] args) {
		int count =0;
		while(count = count++ < 10){ //Compilation Error
			System.out.println("I am Batman "+count);
		}
		System.out.println(count);
	}
}