public class Anagram {
	public static void main(String[] args) {
		String s1="heart";
		String s2="earth";
		char[] sortS1=sort(s1.toLowerCase());
		char[] sortS2=sort(s2.toLowerCase());
		boolean flag=compare(sortS1,sortS2);
		if (flag)
			System.out.println(s1+" and "+s2+" are "+"Anagram");
		else
			System.out.println(s1+" and "+s2+" are not "+"Anagram");
	}
	public static char[] sort(String s) {
		char[] array=s.toCharArray();
		for(int i=0;i<array.length;i++) 
			for(int j=i+1;j<array.length;j++) 
				if(array[i]>array[j]) {
					char a=array[i];
					array[i]=array[j];
					array[j]=a;
				}
		return array;
	}
	static boolean compare(char[] s1,char[] s2) {
		boolean flag=true;
		if(s1.length!=s2.length)
			return false;
		for(int i=0;i<s1.length;i++) 
			if(!(s1[i]==s2[i]))
				return false;
		return flag;
}
	}