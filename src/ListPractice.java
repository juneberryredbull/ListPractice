// Eddie Hart
// April 15th, 2024
// CSC 1060

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ListPractice {
    public static void reverseList(ArrayList<Integer> array) {
        System.out.println("Your values, reversed:");
        int arrayLength = array.size();
        int index = arrayLength;
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(array.get(index - 1));
            index--;
        }
    }
    public static ArrayList<Character> stringToList(String string){
        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++){
            charList.add(string.charAt(i));
        }
        return charList;
    }
    public static ArrayList<Integer> createListWithBounds(int start, int end, int step){
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = start; i < end; i += step){
            numberList.add(i);
        }
        return numberList;
    }
    public static ArrayList<String> findAndDestroyAllAmoebas(ArrayList<String> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).equals("amoeba")){
                array.remove(i);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        // this code block focuses on the reverseList method
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numberHolder = new ArrayList<>();
        System.out.println("Enter values (-1 to stop):");
        int userInput = input.nextInt();

        while (userInput != -1) {
            numberHolder.add(userInput);
            System.out.print(":");
            userInput = input.nextInt();
        }
        reverseList(numberHolder);

        // this code block is for the stringToList method
        System.out.println("Next up, enter a string to turn into list: ");
        String stringInput = input.next();
        ArrayList<Character> charList = stringToList(stringInput);
        System.out.println(charList);

        // this code block is for the createListWithBounds method
        System.out.println("Lastly, enter a beginning number, an end number, and the step size:\nBeginning:");
        int beginningNumber = input.nextInt();
        System.out.println("End number:");
        int endNumber = input.nextInt();
        System.out.println("Step size:");
        int stepSize = input.nextInt();
        ArrayList<Integer> numberList = createListWithBounds(beginningNumber, endNumber, stepSize);
        System.out.println(numberList);

        // this code block is for the findAndDestroyAllAmoebas method
        System.out.println("\nDie, evil amoebas, die!!!!!!");
        ArrayList<String> amoebaList = new ArrayList<>(Arrays.asList("amoeba", "virus", "amoeba", "bacteria", "bacteria", "skin cell"));
        System.out.println(amoebaList);
        amoebaList = findAndDestroyAllAmoebas(amoebaList);
        System.out.println(amoebaList);
    }
}
