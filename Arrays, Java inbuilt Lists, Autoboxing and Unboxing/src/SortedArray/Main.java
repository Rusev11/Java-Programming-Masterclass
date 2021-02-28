package SortedArray;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printArray(sortIntegers(getInteger(3)));
    }

    public static int[] getInteger(int n){

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    public static void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d\n",i,array[i]);
        }
    }

    public static int[] sortIntegers (int[] array){
        int spareNumber;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j]>array[i]){
                    spareNumber = array[i];
                    array[i]=array[j];
                    array[j]=spareNumber;
                }
            }
        }
        return array;
    }
}
