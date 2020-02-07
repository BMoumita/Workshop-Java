package innerclasses;

public class MemberInnerClass {
	private String password = "abcd12";
	class checkMemberInnerClass{
		String showpassword() {
			return password;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInnerClass memberInnerClass = new MemberInnerClass();
		MemberInnerClass.checkMemberInnerClass checkMemberInnerClass = memberInnerClass.new checkMemberInnerClass();
		System.out.println(checkMemberInnerClass.showpassword());

	}

}
