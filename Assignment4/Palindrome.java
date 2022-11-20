public class Palindrome {
	public static void main(String[] args) {
		String givenValue="2552";
		String reverseValue="";
		givenValue=givenValue.toLowerCase();
		for(int i=givenValue.length()-1;i>=0;i--) 
			reverseValue+=givenValue.charAt(i);
		if(givenValue.equals(reverseValue))
			System.out.println("The Given Data is palidrome");
		else 
			System.out.println("The Given Data"
					+ " is not palidrome");
	}
}