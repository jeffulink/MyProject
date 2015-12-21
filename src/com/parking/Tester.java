package com.parking;

import java.util.Date;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("plz input time");
		String time = scanner.nextLine();
		System.out.print("input car number");
		String plate = scanner.nextLine();
	}

}
