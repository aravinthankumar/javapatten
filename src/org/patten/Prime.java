package org.patten;

public class Prime {
	public static void main(String[] args) {
//		int num =100;
//		for (int i = 0; i < num; i++) {
//			if(i%2!=0 && i%3!=0 && i%5!=0) {
//				System.out.println(i);
//			}
//			
//		}
		System.out.println("=============================================================");
		String s = "Aravinthan";
		
		String s1=" ";
		
		for (int i = s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			//s1=ch+s1;
			System.out.print(ch);
			
		}
		System.out.println();
		System.out.println("=============================================================");
String nm ="my name is aravinthan";
String[] sp = nm.split(" ");

for (int i = sp.length-1; i >=0; i--) {
	System.out.print(sp[i]+" ");
	
	
}
System.out.println();
System.out.println("=============================================================");
String nm1 ="my name is aravinthan";
String[] sp1 = nm.split("");

for (int i = sp1.length-1; i >=0; i--) {
System.out.print(sp1[i]);


}
System.out.println();
System.out.println("=============================================================");

String p ="dad";
String tv="";
for (int i = p.length()-1; i >=0; i--) {
	char c = p.charAt(i);
	tv=tv+c;
}
System.out.println(tv);

System.out.println();
System.out.println(p);
if(p.equals(tv)) {
	System.out.println("it is palindrome");
}else {
	System.out.println("it is not palindrome");
}
	
		
	}
	
	private void sysout() {
		// TODO Auto-generated method stub

	}

}
