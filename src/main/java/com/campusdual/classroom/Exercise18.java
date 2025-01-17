package com.campusdual.classroom;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise18 {

	public static void main(String[] args) {
		showInlineArray(createAndInitializeArray(5));
	}

	public static int[] createAndInitializeArray(int num) {
		int[] intArray = new int[num];
		for (int i = 0; i < num; i++){
			intArray[i] = i + 1;
		}
		return intArray;
	}

	public static	void showInlineArray(int[] intArray) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < intArray.length; i++) {
			stringBuilder.append((i + 1)).append(" ");
		}
		System.out.println(stringBuilder.toString().trim());
	}
}
