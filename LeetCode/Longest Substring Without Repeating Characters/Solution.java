import java.util.*;

class Solucao {
	public int lengthOfLongestSubstring(String s) {
		Stack<Character> seen = new Stack<>();
		int resp = 0;
		for(int i = 0;i < s.length();i++) {
			char currentChar = s.charAt(i);

			int pos = seen.indexOf(currentChar);

			if(pos != -1) {
				while(pos >=0) {
					seen.remove(0);
					pos--;;
				}
			}

			seen.push(currentChar);

			resp = Math.max(resp,seen.size());

		}

		return resp;
	}

}
