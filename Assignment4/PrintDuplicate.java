public class PrintDuplicate {
	public static void main(String[] args) {
		String findDuplicate="abcdefghijklmnopqrstuvwxyz";
		String duplicateChar="";
		char[] duplicateCharArray;
		boolean repeated=false;
		for(int i=0;i<findDuplicate.length();i++) {
			for(int j=i+1;j<findDuplicate.length();j++) {
				if(findDuplicate.charAt(i)==findDuplicate.charAt(j) && !duplicateChar.contains(""+findDuplicate.charAt(i)))  {
					duplicateChar+=findDuplicate.charAt(i);
					break;
				}
			}
		}
		duplicateCharArray=duplicateChar.toCharArray();
		if(duplicateCharArray.length>0) {
		System.out.println("The Duplicated character are");
		for(char a: duplicateCharArray)
			System.out.println(a);
		} else
			System.out.println("No Duplicated character are Present");
	}
}