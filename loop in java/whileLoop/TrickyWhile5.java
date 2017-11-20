class TrickyWhile5{
	public static void main(String[] args) {
		int count=0;
		while(count++<10);{
			System.out.println("I am Batman"+count);
			count++;
		}
		System.out.println(count);
	}
}