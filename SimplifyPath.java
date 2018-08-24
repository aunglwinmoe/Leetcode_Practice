package algorithm;

public class SimplifyPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(simplifyPath("/home/"));
		System.out.println(simplifyPath("/a/./b/../../c/"));
		System.out.println(simplifyPath("/../"));
		System.out.println(simplifyPath("/home//foo/"));
	}

	public static String simplifyPath(String path) {
		String[] splitPath = path.split("/");
//		char[] arr = splitPath.toString().toCharArray();
		if(path == "/../") {
			return "/";
		}
		
		for(int i=0; i<splitPath.length; i++) {
			if(splitPath[i] == "//") {
				splitPath[i].replace("//", "/");
			}			
		}		
//		System.out.println("/" + splitPath[splitPath.length-1]);
		
		return ("/" + splitPath[splitPath.length-1]);

	}

}
