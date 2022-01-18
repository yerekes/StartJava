public class Calculator {
    public static void main(String[] args) {
    int num1 = 2;
    int num2 = 5;
    char operation = '^';
    if(operation == '+') {
        System.out.println(num1 + num2);
        } else if(operation == '-') {
            System.out.println(num1 - num2);
        } else if(operation == '*') {
            System.out.println(num1 * num2);
        } else if(operation == '/') {
            System.out.println(num1 / num2);
        } else if(operation == '^') {
            int num3 = 1;
            for(int i = 1; i <= num2; i++) {
                num3 = num3 * num1;
            }
            System.out.println(num3);
        } else if(operation == '%') {
            System.out.println(num1 % num2);
        }
    }
}