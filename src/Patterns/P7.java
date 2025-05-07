package Patterns;

public class P7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ((n * 2) - 1); j++) {
                if (j < n - i - 1) {
                    System.out.print(" ");
                } else if (j >= (n - i - 1) + (i * 2 + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}

//            *
//           ***
//          *****
//         *******
//        *********

//    public static void main(String[] args) {
//        int n = 5;
//
//        for (int i = 0; i < n; i++) {
//            // Print leading spaces
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            // Print stars
//            for (int j = 0; j < (2 * i + 1); j++) {
//                System.out.print("*");
//            }
//
//            // Move to the next line after each row
//            System.out.println();
//        }
//    }