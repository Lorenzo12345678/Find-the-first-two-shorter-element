

import java.util.Scanner;

public class MINarray {
    Scanner scanner = new Scanner(System.in);
    int numElement;
    int[] array;
    int firstNum;
    int secondNum;

    public MINarray() {
        System.out.print("Inserire il numero di elementi: ");
        numElement = scanner.nextInt();


    }


    public void setArray() {

        array = new int[numElement];
        for (int i = 0; i < numElement; i++) {
            System.out.print("Elemento " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public int[] getArray() {
        return array;
    }

    public class ExeArrayVuoto extends Exception {
        public String toString() {
            String err = "Non ci sono elementi nell'array!";
            return err;
        }
    }

    public int primoMinore() throws ExeArrayVuoto {
        if (array.length == 0) {
            Exception err = new ExeArrayVuoto();
            System.out.println(err.toString());

        } else {
            // Il primo minore
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        firstNum = array[i];

                    } else {
                        break;
                    }
                }
            }


        }
        return firstNum;


    }

    public int secondNum() {
        for (int k = 0; k < array.length; k++) {
            for (int x = 0; x < array.length; x++) {
                if (array[k] == firstNum || array[x] == firstNum) {
                    continue;
                } else {
                    if (array[k] < array[x]) {
                        secondNum = array[k];
                    } else {
                        break;
                    }
                }
            }
        }
        return secondNum;
    }
}
