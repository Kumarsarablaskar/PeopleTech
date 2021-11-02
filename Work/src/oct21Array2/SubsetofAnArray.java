package oct21Array2;

//import java.util.HashSet;

public class SubsetofAnArray {
	public static void main(String[] args) {
	//long[] arr1= {1, 2, 3, 4, 5, 6};
	//long[] arr2 =  {1, 2, 4};
	//long n1=arr1.length;
	//long n2=arr2.length;
		int[] arr1= {10, 5, 2, 23, 19};
		int[] arr2 = {19, 5, 10};
		int n1=arr1.length;
		int n2=arr2.length;
	
	subOfAnArray(arr1, arr2, n1, n2);
	
	//isSubset(arr1, arr2, n1, n2);
	//System.out.println(isSubset(arr1, arr2, n1, n2));
	
	}

	private static void subOfAnArray(int[] arr1, int[] arr2, int n1, int n2) {
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				
				if(arr1[i]==arr2[j]) {
					System.out.println("arr2 is a subset of arr1");
					break;
				}
				else {
					System.out.println("arr2 is not subset of arr1");
					break;
				}
			}
			break;
		}
//		 public static String isSubset( long arr1[], long arr2[], long n1, long n2) {
//		HashSet<Long> ans = new HashSet<>();
//        for (int i=0;i<n2;i++){
//            ans.add(arr2[i]);
//        }
//        int k=0;
//        for (int i=0;i<n1;i++){
//            if(ans.contains(arr1[i])){
//                k++;
//            }
//        }
//        if(k==n2){
//            return "Yes";
//        }
//        else{
//            return "No";
//        }
		
	}
}
