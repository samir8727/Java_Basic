class TernaryDemo2{
	public static void main(String[] args) {
		int x=10;
		int y= x>0?1:-1;
		System.out.println(y);

		String str = "India";
		String data = str.contains("I")?"Str contains 'I'":"str does'nt contains 'I'";
		System.out.println(data);

		int num1 = 10;
		int num2= 60;
		int max = num1>num2?num1:num2;
		System.out.println(max + "Str amoung"+ num1 + "&" + num2);

		

		int credits = 60;
		String year=credits<30?"freshman":
					credits<=59?"sophomore" : credits<=89?"junior":"senior";
		System.out.println(year);

		x=10; y=6;
		int z=100;
		int min = x<y?(x<z?x:z):(y<z?y:z);
		System.out.println(min);
	}
}