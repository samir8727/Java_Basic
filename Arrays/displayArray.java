class displayArray{
	public static void print(int[] array){
		System.out.println();
		System.out.print("[");
		for(int num:array){
			System.out.print(num+" ");
		}
		System.out.print("]");
		System.out.println();
	}

	public static void printChar(char[] array){
		System.out.println();
		System.out.print("[");
		for(int num:array){
			System.out.print(num+" ");
		}
		System.out.print("]");
		System.out.println();
	}

		public static void print2DimensionArray(int[][] array){
			System.out.println();
			for (int i=0;i<array.length;i++){
				System.out.print("[");

				for(int j=0;j<array[i].length;j++){
					System.out.print(array[i][j]+" ");
					//System.out.print("]");
					

				}
				System.out.print("]");
				System.out.println();
			}
			
			System.out.println();
		}

		public static void print2DimensionArrayChar(char[][] array){
			System.out.println();
			for (int i=0;i<array.length;i++){
				System.out.print("[");

				for(int j=0;j<array[i].length;j++){
					System.out.print(array[i][j]+" ");
					//System.out.print("]");
					

				}
				System.out.print("]");
				System.out.println();
			}
			
			System.out.println();
		}
	
}