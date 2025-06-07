

public class SimplifyPath {
	public String simplifyPath(String path) {
		Stack<String> stack = new Stack();

		String[] parts  = path.split("/");
		

		for(String token : parts) {

			if(!token.isEmpty() && !token.equals(".")) {
				if(token.equals("..")) {
					if(!stack.isEmpty()) {
						stack.pop();
					}

				}else {
					stack.push(token);

				}
			}
		}

		StringBuilder resp = new StringBuilder("/");
		for(int i = 0;i<stack.size();i++) {
			resp.append(stack.get(i));

			if(i < stack.size() - 1) {
				resp.append("/");

			}
		}

		return resp.toString();

	}

}

		
