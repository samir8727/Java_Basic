class TrickyWhile6{
	public static void main(String[] args) {
		int mySteryInt=1;
		int count=1;
		while(mySteryInt<3){
			mySteryInt=mySteryInt*count;
			count++;
		}
		System.out.println(mySteryInt);
	}
}