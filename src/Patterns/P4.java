package Patterns;

public class P4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++){
                System.out.print(i + 1 + " ");
            }
            System.out.println(" ");
        }
    }
}


//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5