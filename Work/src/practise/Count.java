package practise;

public class Count {

	public static void main(String[] args) {
		int[] arr= {1,5,8,9,2,6,8,7,8};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==8) {
				count++;
			}
			
		}
		System.out.println("Count of 8 is : "+count);
	}
}
