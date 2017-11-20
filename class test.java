class test{
	public static boolean isEven(int num) {
		// int num=60;
		if(num%2==0){
			return true;
		}
		
		
		return false;
	}
	
	public static void printArray(int[] array){
		for(int num : array){
			System.out.println(num);
		}
	}

	public static int[] generateEvenNumber(int from,int to){
		int[] array=new int[((to-from)/2)];
		int index=0;
		for (int i=from;i<to;i++){
			if (isEven(i)){
				array[index]=i;
				index++;
			}
			// return array;
		}
		return array;

	}

	public static void main(String[] args) {
		printArray(generateEvenNumber(0,14));
	}
	
	
	
}