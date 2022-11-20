public class PrintVowels {
	static int vowelCount=0;
	static int consonantsCount=0;
	static int SpecialCount=0;
	static String vowelList="AEIOU";
	
	public static void main(String[] args) {
		String givenValue="!#$GeeeksforGeeks.Computer.Science.Portal!!";
		
		givenValue=givenValue.toUpperCase();
		char[] stringArray=givenValue.toCharArray();
		for(char a:stringArray) {
			findtype(a);
		}
		System.out.println("vowelCount :      "+vowelCount);
		System.out.println("consonantsCount : "+consonantsCount);
		System.out.println("SpecialCount :    "+SpecialCount);
	}
	static void findtype(char a) {
		if(a>=65 &&a<=90) {
			if(vowelList.contains(""+a)) 
				vowelCount++;
			else
				consonantsCount++;
		} else {
			SpecialCount++;
		}
	}
}