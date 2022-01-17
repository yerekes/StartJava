public class MyFirstGame {
    public static void main(String[] args) {
        int num = 99;
        int random = 66;
        while(num != random){
            if(num > random) {
                System.out.println("Данное число больше того, что загадал компьютер");
                System.out.println("Введите число повторно");
                break;
            } else if(num < random) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                System.out.println("Введите число повторно");
                break;
            } else if(num == random) {
               System.out.println("Поздравляю, число угадано!");
            }

        }
    }
}