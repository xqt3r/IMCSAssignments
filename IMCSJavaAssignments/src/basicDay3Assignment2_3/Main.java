package basicDay3Assignment2_3;


// Basic day 3 Assignment 2

public class Main{
    public static void main(String args[]) {
        int firstArrayMatrix[][] = {{1, 1, 1}, {1, 1, 1}};
        int secondArrayMatrix[][] = {{2, 2, 2}, {2, 2, 2}};
        int sumMatrix[][] = new int[2][3];

        for (int i = 0; i < firstArrayMatrix.length; i++) {
            for (int j = 0; j < firstArrayMatrix[i].length; j++) {
                sumMatrix[i][j] = firstArrayMatrix[i][j] + secondArrayMatrix[i][j];
            }
        }
        for (int i = 0; i < firstArrayMatrix.length; i++) {
            for (int j = 0; j < firstArrayMatrix[i].length; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
        JaggedArray.displayDetails("Dinil"); //Basic day 3 Assignment 3 class
    }
}

// Basic day 3 Assignment 3
class JaggedArray {
    static String[][] info = {{"Tony", "Java", "C", "C++"}, {"Thomas", "Java", "UNIX"}, {"Dinil", "Linux", "Oracle"}, {"Delvin", "RDBMS", "C#", "Oracle"}};

    public static void displayDetails(String name) {
        for (int i = 0; i < info.length; i++) {
            for (int j = 0; j < info[i].length; j++) {
                if (info[i][0].toLowerCase().equals(name.toLowerCase()))
                    System.out.print(info[i][j] + "\t");
            }
        }
    }
}


