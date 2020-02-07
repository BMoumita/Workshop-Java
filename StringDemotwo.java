package string;

public class StringDemotwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		String s1="java training";
		
		System.out.println("location of s:" +s.hashCode());
		System.out.println("location of s1:"+s1.hashCode());
		String s2 = s.concat("training-workshop");
		System.out.println("after concatenation s:" +s2);

	}

}
