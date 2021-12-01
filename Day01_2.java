package day01_2;

import java.util.Scanner;

public class Day01_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a4 = sc.nextInt();
		int a3 = sc.nextInt();
		int a2 = sc.nextInt();
		int a1;
		int count = 0;
		do {
			a1 = sc.nextInt();
			if(a1 == 0)
				break;
			if(a1 + a2 + a3 > a2 + a3 + a4)
				count++;
			a4 = a3;
			a3 = a2;
			a2 = a1;
			
		} while (true);
		System.out.println(count);
		
	}

}
