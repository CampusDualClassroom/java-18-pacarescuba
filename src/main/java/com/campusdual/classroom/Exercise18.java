package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

  public static void main(String[] args) {
      showInlineArray(createAndInitializeArray(Utils.integer("Escriba la longitud del array: ")));
  }

  public static int[] createAndInitializeArray(int length){
    if (length < 0) {
      return new int[0];
    } else {
      int[] intArray = new int[length];
      for (int i = 0; i < length; i++) {
        intArray[i] = i + 1;
      }
      return intArray;
    }
  }

  public static void showInlineArray(int[] intArray) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < intArray.length; i++) {
      stringBuilder.append((i + 1)).append(" ");
    }
    System.out.println(stringBuilder.toString().trim());
  }
}
