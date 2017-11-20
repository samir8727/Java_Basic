class PrimeNumbers{
	public static boolean isPrime(int num){
		int count=0;
		for (int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
			if(count==2){
				return true;
			}
			else{
				return false;
			}
		
	}
	//  public static void main(String[] args) {
	//  	System.out.println(isPrime(12));
	// }

	public static int[] generatePrimeNumber(int from,int to){
		int size=0;
		for(int i=from;i<=to;i++){
			if(isPrime(i))
				size++;
		}
		int [] PrimeArray=new int[size];
		int index=0;
		for(int i=from;i<to;i++){
			if(isPrime(i)){
			PrimeArray[index]=i;
			index++;
			
			}

		}

		return PrimeArray;
	}

	public static void printArray(int[] PrimeArray){
		for(int num : PrimeArray)
			System.out.println(num);
	}

	public static void main(String[] args) {
		printArray(generatePrimeNumber(10,30));
	}
}