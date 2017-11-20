class DispalyArray{
	/*public static void PrintArrays(int[] arrays)
	for(int i=1;i<array.length;i++)
		System.out.println(array[i])
*/



	public static void main(String[] args) {
		int [] my_array={100};
		int sum=0;
		for(int i =0;i<my_array.length;i++)
			my_array[i]=i;
			for(int i=0;i<my_array.length;i++)
			sum+=i;
		
		


		
		

		System.out.println("Sum of Total arrays is - "+ sum);


	}
}