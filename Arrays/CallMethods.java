class callMethods{
	public static void main(String[] args) {
		displayArray.print(MethodsArray.NaturalNumber(11));

		displayArray.print(MethodsArray.randomNumber(5));

		displayArray.print2DimensionArray(MethodsArray.twoD_DaimensionArray(6,6));
 

		displayArray.printChar(MethodsArray.randomAlpha(8));

		displayArray.print(MethodsArray.generateEven(9,20));

		displayArray.print(MethodsArray.generateOdd(9,20));

		displayArray.print(MethodsArray.generatePrime(10,30));

		displayArray.print(MethodsArray.generateFibo(13));

		System.out.println(MethodsArray.isPalindrome(32));

		displayArray.print(MethodsArray.generatePalindrome(10,100));

		System.out.println();

		int[] arrays={5,2,3,1,6,4};
		System.out.println(MethodsArray.sumArray(arrays));

		System.out.println();

		char[] vowelArrays={'a','b','c','d','e','f','g','h','i','j','k','l'};
		System.out.println(MethodsArray.vowelCount(vowelArrays));

		System.out.println();

		int[][] sumArrays={{1,2,3,4},{5,6,7},{8,7,6,5,4}};
		System.out.println(MethodsArray.sum2DArray(sumArrays));

		System.out.println();


		int[][] array1={{1,2,3},{4,5,6,7},{8,9,10}};
		int[][] array2={{3,2,1,4},{3,2,4,5},{4,3,2}};
		System.out.println(MethodsArray.sumTwo2DArray(array1,array2));
	}

}