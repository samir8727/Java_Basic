class FilledwithRandonNo{
	public static void main(String[] args) {
		int [][] randomArrays=new int[20][20];

		for (int i=0;i<randomArrays.length;i++)
			randomArrays[i][randomArrays[i].length]=(int)(Math.random()*10);

		for(int i=0;i<randomArrays.length;i++){	
			for(int j=0;j<randomArrays[i].length;j++)
				//randomArrays[i][j]=(int)Math.random()*100;
				System.out.print(randomArrays[i][j]+" ");
			
			System.out.println();
		}
	}
}