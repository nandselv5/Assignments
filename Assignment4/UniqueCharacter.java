public class UniqueCharacter {
	public static void main(String[] args) {
		String s1="abcda";
		s1=s1.toLowerCase();
		boolean flag=false;
		for(int i=0;i<s1.length();i++) 
			for(int j=i+1;j<s1.length();j++) 
				if(s1.charAt(i)==s1.charAt(j))
					flag=true;
		if(!flag)
			System.out.println("The String contains all unique character");
		else 
			System.out.println("The String contains duplicate character");

	}
}