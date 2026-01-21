class Palindrome{
	public static boolean isPalindrome(String str){
		int n = str.length()/2;
		for(int i = 0; i<= n;i++){
			if(str.charAt(i) != str.charAt(n-i-1)){
				System.out.println("Givevn string is not palindrome");
				return false;
			} else{
				continue;
			}
		}
			return true;
		}
	public static void main(String [] args){
		String str = "madam";
		System.out.println(isPalindrome(str));
	}
}