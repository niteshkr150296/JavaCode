class RevStr1{
	public static void main(String[] args){
		String str = "hello";
		
		char[] revstr = str.toCharArray();
		
		for(int i= revstr.length-1 ; i>=0; i--){
			System.out.print(revstr[i]);
		}
	}
}