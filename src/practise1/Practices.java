package practise1;

public class Practices {
	
	public static void main(String[] args) {
		Revrse2();
		}
	
	public static void Revrse() {
		String rev="";
		 String s = "droom";
		 int len = s.length();
		  for (int i=len-1;i>=0;i--) {
	                 
			 rev = rev+s.charAt(i); 	 
		}
		  System.out.println(rev);
	}
	public static void Revrse2() {
		String s = "drooms";
		StringBuffer sb =new StringBuffer(s);	 
		  System.out.println(sb.reverse());
	}
}
