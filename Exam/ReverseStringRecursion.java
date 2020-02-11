package test;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am Moumita";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);

	}

}
