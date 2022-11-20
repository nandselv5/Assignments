public class RemoveStringDuplicate {
	public static void main(String[] args) {
		String removeDuplicate="cbacdcbc";
		char[] array=removeDuplicate.toCharArray();
		String afterDuplicate="";
		boolean repeated=false;
		for(int i=0;i<removeDuplicate.length();i++) {
			repeated=false;
			for(int j=i+1;j<removeDuplicate.length();j++) {
				if(array[i]==array[j]) {
					repeated=true;
					break;
				}
			}
			if(!repeated)
				afterDuplicate+=array[i];
		}
		System.out.println("Before Removing duplicate = "+removeDuplicate);
		System.out.println("After Removing duplicate = "+afterDuplicate);
		
	}
}