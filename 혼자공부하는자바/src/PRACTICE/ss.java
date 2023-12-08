package PRACTICE;

public class ss {
	public static void main(String[] args) {
		int num = 5;
		char c = 'A';
		
		String str1 = (num == 5)? "num은 5":"num은 5가 아님";
		String str2 = (c == 'A')? "c는 A":"c는 A가 아님";
		
		String result = str1 + ", " + str2;
		System.out.println(result);
		
	}

}
