import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    public static final int SIZE = 20;

    public static void main(String[] args) {

        System.out.println("selection sort");
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ile liczb posortowac:");
        int sizeArray = scaner.nextInt();
        scaner.nextLine();

        double[] numberArray = new double[sizeArray];
        System.out.println("Czy tablice wygenerowac czy podajesz wartosci?");
        System.out.println("Wpisz 1 - wypisywanie z klawiatury");
        System.out.println("Wpisz 2 - wygeneruj");
        String choice = scaner.next();

        switch (choice) {
            case "1" ->{
                System.out.println("Wprowadz "+sizeArray+" kolejno liczb");
                for (int i = 0; i < sizeArray; i++){
                    numberArray[i]= scaner.nextInt();
                }
                System.out.println("Tablica wypisana z klawiatury: ");
                for (int i = 0; i < sizeArray; i++){
                    System.out.print(numberArray[i]+", ");
                }
            }
            case "2" ->{

                System.out.println("Jaki zakres liczb ");
                System.out.println("Liczby od :");
                int start = scaner.nextInt();
                System.out.println("Liczby do :");
                int finish = scaner.nextInt();
                System.out.println("Tablica wygenerowanych liczb");
                for (int i = 0; i < sizeArray; i++){
                    numberArray[i] = (int) (Math.random() * (finish-start))+start;
                    System.out.print(numberArray[i]+", ");
                }
            }
        }

        System.out.println();
        System.out.println("Posortowana tablica");
        double[] sortedArray = selectionSort(numberArray);
        for (int i = 0; i < sizeArray; i++){
            System.out.print(sortedArray[i]+", ");
        }

    }

    public static double[] selectionSort(double[] numberArray){
        int size = numberArray.length;
        int k;
        double temp;
        for(int i = 0; i < size; i++){
            k = i;
            for (int j = i + 1; j < size; j++)
                if(numberArray[j] < numberArray[k]) k = j;
                temp = numberArray[k];
                numberArray[k] = numberArray[i];
                numberArray[i] = temp;

        }
        return numberArray;
    }
}