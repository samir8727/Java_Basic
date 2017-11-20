class MethodsArray{

	//Program1-- Creat a method which access size of the array input and return array filled with natural number.
	public static int[] NaturalNumber(int size){
		int[] array=new int[size];
		for(int i=0;i<array.length;i++){
			array[i]=i+1;
		} 
		return array;
	}

	//displayArray.print(MethodsArray.NaturalNumber(11));

    // OutPut:samir@samir-X540SAA:~/Documents/JavaBasic/JavaProgramingFundamentals/Arrays$ java callMethods 
    //[1 2 3 4 5 6 7 8 9 10 11 ]

    //Program 2-- Creat a single daimension array that filled with Random numbers;
    public static int[] randomNumber(int size){
    	int[] array=new int[size];
    	for(int i=0;i<array.length;i++){
    		array[i]=(int)(Math.random()*100);
    	}
    	return array;
    }

    //displayArray.print(MethodsArray.randomNumber(5));
    //Output:  [93 5 83 79 77 ]

    //Program3--Creat a 2 Dimension array that filled with random number.
    public static int[][] twoD_DaimensionArray(int row,int coloum){
    	int[][] array=new int[row][coloum];
    	int i,j;
    	for(i=0;i<array.length;i++){
    		for(j=0;j<array[i].length;j++){
    			array[i][j]=(int)(Math.random()*100)/10;
    		}
    	}
    	return array;
    }
    //displayArray.print2DimensionArray(MethodsArray.twoD_DaimensionArray(6,6));

    /*Output:
	[3 6 7 0 0 1 ]
	[2 1 3 2 4 6 ]
	[7 4 3 0 1 6 ]
	[6 1 8 4 8 7 ]
	[9 1 8 5 4 8 ]
	[0 0 8 8 4 7 ] */

	//Program4:--Creat a Array that filles with random Alphabet.
	public static char[] randomAlpha(int size){
		char[] array=new char[size];
		int count=0;
		while (count!=array.length){
			int i=(int)(Math.random()*100);
			if(i>65&&i<90){
				array[count]=(char)i;
				count++;
			}
		}
		
		return array;

	}

	//Program5:- displayArray.printChar(MethodsArray.randomAlpha(8));

	//Output: [80 87 73 79 86 84 71 74 ]

	// //Program4:--Creat a 2 daimension Array that filles with random Alphabet.
	// public static char[][] randomAlpha(int size){
	// 	char[][] array=new char[size][size];
	// 	int count=0;
	// 	for(int i=0;i<array.length;i++){
	// 		for(int j=0;j<array[i].length;i++){
	// 			if(i>65&&i<90){
	// 				if(j>65&&i<90){
	// 					array[count][]count=(char)i,j;
	// 			count++;

	// 				}
				
	// 		}
	// 	}
	// 	}
		
	// 	return array;

	//}

	//Program6:-Write a program to generate a even number in between two number.

	public static int[] generateEven(int from,int to){
		int[] arrays=new int[((to-from)/2)];
		int count=0;
		for (int i=from;i<to;i++){
			if(i%2==0){
				arrays[count]=i;
				count++;
			}
			//count++;
		}
		return arrays;
	}
	
	//displayArray.print(MethodsArray.generateEven(9,20));
	//Output: [10 12 14 16 18 ]


	//Program7:-Write a program to generate a odd number in between two number.
	public static int[] generateOdd(int from,int to){
		int[] arrays=new int[((to-from)/2)+1];
		int count=0;
		for (int i=from;i<to;i++){
			if(i%2!=0){
				arrays[count]=i;
				count++;
			}
			//count++;
		}
		return arrays;
	}

	//displayArray.print(MethodsArray.generateOdd(9,20));
	//OutPut:-[9 11 13 15 17 19 ]


	//Program8:Write aprogram to genrate praime number in between two number;

	public static boolean isPrime(int num){
		int count=0;
		for(int i=1;i<=num;i++){
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

	public static int[] generatePrime(int from,int to){
		int size=0;
		for(int i=from;i<=to;i++){
			if(isPrime(i)){
				size++;
			}
		}
		int [] praimeArrays=new int[size];
		int index=0;
		for(int i=from;i<to;i++){
			if(isPrime(i)){
				praimeArrays[index]=i; 
				index++;
			}
		}
		return praimeArrays;
	}

	//displayArray.print(MethodsArray.generatePrime(10,30));
	//Output: [11 13 17 19 23 29 ]


	//Program9 : Write a java Program that store fibonacci Series.

	public static int[] generateFibo(int num){
		int[] arrays=new int[num];

		int a=0;
		int b=1;
		arrays[0]=a;
		arrays[1]=b;

		for(int i=2;i<arrays.length;i++){
			int c=a+b;
			arrays[i]=c;
			a=b;
			b=c;
		}
		return arrays;
	}
	//displayArray.print(MethodsArray.generateFibo(13));
	//OutPut : [0 1 1 2 3 5 8 13 21 34 55 89 144 ];


	//Program10 : Write a Program to Check a number is Palindrome or not;

	public static boolean isPalindrome(int num){
		int reverse=0;
		int temp=num;
		while(num!=0){
			reverse=reverse*10;
			reverse=reverse+(num%10);
			num=num/10;
		}
		if (temp==reverse) 
			return true;
		
		else
			return false;
	}
	//System.out.println(MethodsArray.isPalindrome(55));
	//OutPut : true

	//Program 11 : Write a Program that generate Palindrome number in between two numbers;

	public static int[] generatePalindrome(int from,int to) {
		int size=0;
		for(int i=from;i<=to;i++){
			if(isPalindrome(i)){
				size++;
			}
		}
			int[] PalindromeArrays=new int[size];
			int index=0;
			for(int i=from;i<to;i++){
				if(isPalindrome(i)){
					PalindromeArrays[index]=i;
					index++;

				}
			}
		return PalindromeArrays;
	}
	//displayArray.print(MethodsArray.generatePalindrome(10,100));
	//OutPut : [11 22 33 44 55 66 77 88 99 ]


	//Program12 : write a program that receive arrays as input and return the sumation of that numbers;

	public static int sumArray(int[] arrays){
		int sum=0;
		for(int i=0;i<arrays.length;i++){
			sum+=arrays[i];
		}
		return sum;
	}

	/*public static void main(String[] args) {
		int[] arrays={5,2,3,1,6,4};
		System.out.println(MethodsArray.sumArray(arrays));*/

		//OutPut: 21
	

	//Program 13 : Write a program that take Charecter arrays as input and return total numbers of vowel of them

	public static int vowelCount(char[] vowelArrays){
		int count=0;
		for(int i=0;i<vowelArrays.length;i++){
			if(vowelArrays[i]=='a'||vowelArrays[i]=='e'||vowelArrays[i]=='i'||vowelArrays[i]=='o'||vowelArrays[i]=='u')
			
				count++;
			
		}
		return count;
	}

		// public static void main(String[] args) {
		// 	char[] vowelArrays={'a','b','c','d','e','f','g','h','i','j','k','l'};
		// 	System.out.println(MethodsArray.vowelCount(vowelArrays));
		// }

		//OutPut: 3


	//Program 14:A method that accepts total no of rows as input and return jagged array filled with random intiger;

	// public static int[][] randomJagged(int rows){
	// 	int[][] arrays=new int[rows][];

	// }

	//Program 15: Write a method that perform summation of all number avilable in 2-D arrays;

	public static int sum2DArray (int[][] sumArrays){
		int sum=0;
		for(int i=0;i<sumArrays.length;i++){
			for(int j=0;j<sumArrays[i].length;j++){
				sum+=sumArrays[i][j];
			}
		}
		return sum;
	}
	// public static void main(String[] args) {
	// 	int[][] sumArrays={{1,2,3,4},{5,6,7},{8,7,6,5,4}};
	// 	System.out.println(MethodsArray.sum2DArray(sumArrays));
	// }
	//OutPut: 58

	//Program 16: Addition of two two daimension arrays
	public static int sumTwo2DArray(int[][] array1,int[][] array2){
		int sum=0,sum1=0,sum2=0;
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array1[i].length;j++){
				sum1+=array1[i][j];
			}
		}
		for(int i=0;i<array2.length;i++){
			for(int j=0;j<array2[i].length;j++){
				sum2+=array2[i][j];
			}
		}
		return (sum=sum1+sum2);


		/*public static void main(String[] args) {
			int[][] array1={{1,2,3},{4,5,6,7},{8,9,10}};
		int[][] array2={{3,2,1,4},{3,2,4,5},{4,3,2}};
		System.out.println(MethodsArray.sumTwo2DArray(array1,array2));
		} */

		//OutPut : 88;

	}
}