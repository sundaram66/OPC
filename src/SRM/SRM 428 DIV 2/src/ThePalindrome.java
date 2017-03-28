public class ThePalindrome {
	
	public int find(String s) {

		int givenLen = s.length();
		if(isPalindrome(s)) {
			return givenLen;		}

		int i=1;
		for(i=1;i<givenLen;i++) {
			if(isPalindrome(s.substring(i)))
				return givenLen+i;
		}
		return givenLen+i-1;
	}

	public boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		String rev = sb.reverse().toString();

		if(s.equals(rev)) return true;
		return false;
	}
}
