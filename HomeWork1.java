public class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 28;
        int b = 33;

        if (a+b >= 0) {
            System.out.println("The sum is positive");
        }
        else {
            System.out.println("The sum is negative");
        }

    }

    public static void printColor() {
        int value = 8;

        if (value <= 0) {
            System.out.println("Red");
        } else if (value <=100) {
            System.out.println("Yellow");
        } else if (value >100){
            System.out.println("Green");
        }
    }
    public static void compareNumbers() {
        int a = 5;
        int b = 59;
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}