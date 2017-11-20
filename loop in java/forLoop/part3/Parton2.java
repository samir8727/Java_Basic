class FilledPyramidAsterisk{
	public static void main(String[] args) {
		int no_of_spaces=4;
		int no_of_stars=1;
		for (int i=1;i<=5;i++){
			for(int j=1;j<=no_of_spaces;j++){
				System.out.print(" ");

			}
			no_of_spaces--;
			for(int k=1;k<=no_of_stars;k++){
				System.out.print("*");
			}
			no_of_stars+=2;
			System.out.println();

		}

	}

}