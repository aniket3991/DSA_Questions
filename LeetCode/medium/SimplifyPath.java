package medium;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");

        Stack<String> finalPath = new Stack<>();
        for (int i = 0; i < paths.length; i++) {
            if (paths[i].equals("..") && finalPath.size() > 0) {
                finalPath.pop();
            } else if (!paths[i].equals(".") && !paths[i].equals("") && !paths[i].equals("..")) {
                finalPath.push(paths[i]);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (String s : finalPath) {
            ans.append("/");
            ans.append(s);
        }
        return ans.length() != 0 ? ans.toString() : "/";
    }

    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        System.out.println(simplifyPath.simplifyPath("/a/./b/../../c/"));
        // "/a/./b/../../c/"
    }
}
