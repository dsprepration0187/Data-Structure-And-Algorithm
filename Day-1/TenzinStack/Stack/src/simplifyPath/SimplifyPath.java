package simplifyPath;

import java.util.Stack;

public class SimplifyPath {
	
	public static void main(String args []) {
		Solution sol = new Solution();
		String result = sol.simplifyPath("/.");
		System.out.println(result);
	}
}

	class Solution {
		public String simplifyPath(String path) {
			Stack<String> stack = new Stack<>();
			String[] pathArray = path.split("/");
			String resultPath = "";
			for (int i = 0; i < pathArray.length; i++) {
				if (pathArray[i].equals(".") || pathArray[i].equals("") || pathArray[i].equals(" "))
					continue;
				else if (stack.empty() && !pathArray[i].equals("..")) {
					stack.push(pathArray[i]);
				} else if (pathArray[i].equals("..") && !stack.empty()) {
					stack.pop();
				} else {
					if (!stack.empty())
						stack.push(pathArray[i]);
				}

			}
			if (stack.empty()) {
				return "/";
			}

			while (!stack.empty()) {
				String popStr = stack.pop();
				popStr = "/".concat(popStr);
				resultPath = popStr.concat(resultPath);
			}

			return resultPath;

		}
	}
