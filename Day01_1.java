package day01_1;

import java.util.Scanner;

public class Day01_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int neu;
		int alt = Integer.MAX_VALUE;
		int count = 0;
		do {
			neu = sc.nextInt();
			if(neu == 0)
				break;
			if(neu > alt)
				count++;
			alt = neu;
			
		} while (true);
		System.out.println(count);
		
	}

}
