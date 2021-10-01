package Programs1;

public class Series1 {
	public static void series(int n) {
		int a=1,b=2,c=3,d=4,sum=0;
		for(int i=1;i<n;i++) {
			System.out.print(i+" ");
		
		if(i%4==0) {
			sum=a+b+c+d;
			System.out.print(sum+" ");
			a=i+1;
			b=i+2;
			c=i+3;
			d=i+4;	
		}
		}
	}
	public static void main(String[] args) {
		
	 int n=10;
	 series(n);
	}

}