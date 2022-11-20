public class Panagram {
	public static void main(String[] args) {
		String s1="A quick brown fox jumps over the lazy dog";
		s1=s1.toUpperCase().replace(" ","");
		int[] countArray=new int[26];
		boolean flag=false;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			int index=ch-65;
			if(index>=0 & index<=25) {
				countArray[index]=++countArray[index];
			}
		}
		for(int i:countArray)
			if(i<=0)
			flag=true;
		if(!flag)
			System.out.println("This is a Panagram");
		else
			System.out.println("This is not a Panagram");
	}
}