import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Main {
      public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        boolean showMenu = true;

        while (showMenu) {
            System.out.println("Please choose an option:");
            System.out.println("Problems solved: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13");
            String choice = read.nextLine();

            switch (choice) {

                case "1":
                    Solutions.problem1();
                    break;
                case "2":
                    Solutions.problem2();
                    break;
                case "3":
                    Solutions.problem3();
                    break;
                case "4":
                    Solutions.problem4();
                    break;
                case "5":
                    Solutions.problem5();
                    break;
                case "6":
                    Solutions.problem6();
                    break;
                case "7":
                    Solutions.problem7();
                    break;
                case "9":
                    Solutions.problem9();
                    break;
                case "11":
                    Solutions.problem11();
                    break;
                case "12":
                    Solutions.problem12();
                    break;
                case "13":
                    Solutions.problem13();
                    break;
                case "e":
                    showMenu = false;
                default:
                    break;
            }
        }
    }
}
