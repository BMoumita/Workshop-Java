package string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		String s1 = "java";
		String s2 = new String("java");
		
		System.out.println("location of s:" +s.hashCode());
		System.out.println("location of s1:" +s1.hashCode());
		
		if(s==s1) {
			System.out.println("true:location is same");
		}
		else {
			System.out.println("false:location is different");
		}
		
		if(s.contentEquals(s2)) {
			System.out.println("true:value is same");
		}
		else {
			System.out.println("false:value is not same");
		}

	}

}
