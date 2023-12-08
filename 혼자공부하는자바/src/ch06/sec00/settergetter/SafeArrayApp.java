package ch06.sec00.settergetter;

public class SafeArrayApp {

	public static void main(String[] args) {
		int[] array = new int[] {0, 1, 2};
		for(int i = 0;i<array.length;i++) {
			System.out.println("["+i+"] = "+array[i]);
		}
		
		SafeArray arr = new SafeArray(3);
		for(int i= 0;i<=arr.length;i++) {
			arr.put(i, i*10);
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(""+i+"="+arr.get(i));
		}
		
	
		

	}

}