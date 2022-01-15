public class Cycle {
    public static void main(String[] args) {
        int num1 = -6;
        int num2 = 10;
        for(int i = 0;i<21;i++){
            System.out.println(i);
        }
        while(num1 <= 6){
            System.out.println(num1);
            num1 = num1 +2;
        }
        do{
            int ost = num2 % 2;
            if(ost == 1){
                System.out.println(num2);
                num2 = num2 + 1;
            } else {
            num2 = num2 + 1;
            }
        }while(num2 <= 20);
    }
}
