package org.patten;

public class Patten {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >i; j--) {
				
				System.out.print("@");
				
			}
			System.out.println("@");
		}
		
		System.out.println("____________________@@@______________________");

		
		for (int i = 1; i <=5; i++) {
			for (int j =1; j <i; j++) {
				
				System.out.print("@");
				
			}
			System.out.println("@");
		}
		
		System.out.println("____________________@@@______________________");

		for (int i =1; i <=3; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
				
			}
			for (int k =3; k >=i; k-- ) {
				System.out.print("%");
				
			}
			System.out.println(" ");
			
		}
		
		
		
		
		
		System.out.println("____________________@@@______________________");
		
		
		for (int i =1; i <=3; i++) {
			for (int j =2; j >=i; j--) {
				System.out.print(" ");
				
			}
			for (int k =1; k <=i; k++) {
				System.out.print("$");
				
			}
			System.out.println(" ");
			
		}
		
		
		System.out.println("____________________@@@______________________");
		
		for (int i = 1; i <=9; i++) {
			for (int j = 8; j >=i; j--) {
				System.out.print(" ");
				
			}
			for (int k= 1;  k<=i; k++) {
				System.out.print("*");
				
			}
			for (int l = 1; l <i; l++) {
				System.out.print("*");
				
			}
			
			
			
			
			
			
			
			System.out.println();
			
		}
		
		System.out.println("____________________@@@______________________");
		
		for (int i = 1; i <=3; i++) {
			
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			for (int k = 3; k >=i; k--) {
				System.out.print("#");
			}
			for (int l = 2; l>=i; l--) {
				System.out.print("#");
				
			}
			System.out.println(" ");
			
		}
	

		System.out.println("____________________@@@______________________");

		for (int i =1; i <=5; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print("^");
				
			}
			
			
			System.out.println(" ");
			
		}
		for (int k =1; k <=5; k++) {
			
			for (int l =4; l >=k; l--) {
				System.out.print("^");
			}
			System.out.println(" ");
			
		}
		System.out.println("____________________@@@______________________");

		for (int i =1; i <=3; i++) {
			
			
			for (int j =2; j >=i; j--) {
				System.out.print(" ");
				
			}
			for (int k =1; k <=i; k++) {
				System.out.print("&");
				
			}
			System.out.println(" ");
			
			
			
			
		}
		
		
	}

}
