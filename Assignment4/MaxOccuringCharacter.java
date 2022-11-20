public class MaxOccuringCharacter {
	public static void main(String[] args) {
		fincMaximumOccurence();
	}

	public static void  fincMaximumOccurence() {
		String s1="s";
		char[] s2=s1.toCharArray();
		int[] arr=new int[s2.length];
		int max=1;
		for(int i=0;i<s2.length;i++) {
			int count=1;
			for(int j=i+1;j<s2.length;j++) {
				if(s2[i]==s2[j]) {
					count++;	
				}
			}
			arr[i]=count;
		}
		int maxOccur=1;
		for(int i=0;i<arr.length;i++)
			if(arr[i]>maxOccur) 
				maxOccur=arr[i];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==maxOccur) {
				System.out.println("The Maximum occuring character is "+s2[i]+" and count is "+maxOccur);
			}
		}
	}
}