/**
* Java 1. Home Work #2
*
* @author Artem Anurin
* @version 14.02.2022
*/

class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(twosum(4, 11));
        boolean result = posneg(9);
        System.out.println(result? "Positive number" : "Negative number");
        System.out.println(countnum(97));
        repeatString("HomeWork2!", 4);
    }



    static boolean twosum(int a, int b) {
        int sum = a+b;
        return (sum >=10)&&(sum <=20);
    }
    
    static boolean posneg(int a) {
        return a >=0;
    }
    
    static boolean countnum(int a) {
        return (a < 0);
    }
    
    static void repeatString(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }
}

