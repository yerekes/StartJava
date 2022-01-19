public class MyFirstGame {
    public static void main(String[] args) {
        int num = 55;
        int random = 66;
        if(num == random) {
            System.out.println("Поздравляю, число угадано!");
            } 

        while(num != random) {
            if(num > random) {
                System.out.println("Данное число больше того, что загадал компьютер");
                break;
            } else if(num < random) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                break;
            } 
            System.out.println("Введите число повторно");
        }

    }
}