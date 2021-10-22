package oct21Strings;

public class DuplicateString {
	 
    public static void main(String[] args) {

        String str="people";
        int count=0;
        char ch[]=str.toCharArray();
         for(int i=0;i<ch.length;i++) {
             for(int j=i+1;j<ch.length;j++) {

                 if(ch[i]==ch[j]) {
                 System.out.print(ch[j]+" ");
                 count++;
                 }
             }
         }
 
    }
 
}