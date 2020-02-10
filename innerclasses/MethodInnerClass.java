package innerclasses;

public class MethodInnerClass {
	private int password = 1234;
	void displayPrivateData() {
		class CheckMethodInnerClass{
			void showPassword() {
				System.out.println(password);
			}
		}
		CheckMethodInnerClass checkmethodInnerClass=new CheckMethodInnerClass();
		checkmethodInnerClass.showPassword();
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MethodInnerClass methodInnerClass = new MethodInnerClass();
		methodInnerClass.displayPrivateData();

	}

}
