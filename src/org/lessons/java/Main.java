package org.lessons.java;

public class Main {

public static void main(String[] args) {
		
		String[] likeFoods = {
			"cibo 1",
			"cibo 2",
			"cibo 3",
			"cibo 4",
			"cibo 5",
		};
		
		System.out.println("Quantità Cibi: " + likeFoods.length);
		System.out.println("Miglior cibo: " + likeFoods[0]);
		System.out.println("Peggior cibo (tra i tuoi preferiti): " + likeFoods[likeFoods.length - 1]);

		int medIndex = likeFoods.length / 2;
		boolean pairArray = likeFoods.length % 2 == 0;

//		if (pairArray) {
//		
//			System.out.println("Cibo med: " + likeFoods[medIndex - 1] + " ~ " + likeFoods[medIndex]);
//		} else {
//			
//			System.out.println("Cibo med: " + likeFoods[medIndex]);
//		}
		
		System.out.println("Cibo med: " + (
				pairArray
				? likeFoods[medIndex - 1] + " ~ " + likeFoods[medIndex]
				: likeFoods[medIndex]
			));
	}
}
