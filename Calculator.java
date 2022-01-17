public class Calculator{
    public static void main(String[] args) {
    int num1 = 23;
    int num2 = 34;
    char operation = '*';
    int result;
    if(operation == '+'){
        result = num1 + num2;
        System.out.println(result);
        } else if(operation == '-'){
            result = num1 - num2;
            System.out.println(result);
        } else if(operation == '*'){
            result = num1 * num2;
            System.out.println(result);
        } else if(operation == '/'){
            result = num1 / num2;
            System.out.println(result);
        } else if(operation == '^'){
            result = num1 ^ num2;
            System.out.println(result);
        } else if(operation == '%'){
            result = num1 % num2;
            System.out.println(result);
        }
    }
}