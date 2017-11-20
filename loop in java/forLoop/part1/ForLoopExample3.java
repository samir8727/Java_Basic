class ScoreOfVariable{
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			System.out.println ("Jai Hanuman");

		}
		//System.out.println(i);
		//error because scope of i is within the loop
		//if we want to access i then we need to declare i before the loop then within the
		//loop its value may change//then after the loops we can access it

		//Example
		int j;//Scope of j starts here
		for(j=0;j<2;j++){
			System.out.println("j : "+j);
		}
		System.out.println(j);
	}
}