public class Calculator{
    public static void main(String[] args) {
    int num1 = 2;
    int num2 = 3;
    int chislo = 1;
    char operation = '^';
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
            for(int i=1; i <= num2; i++){
                chislo = chislo * num1;
            }
            result = chislo;
            System.out.println(result);
        } else if(operation == '%'){
            result = num1 % num2;
            System.out.println(result);
        }
    }
}