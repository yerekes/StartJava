public class ConditionalStatement {
    public static void main(String[] args) {
        int vozr = 10;
        double rost = 1.60;
        boolean pol = true;
        char firstName = 'U';
        if(vozr > 20){
            System.out.println("Стареешь больше 20и");
        }
        if(pol = true){
            System.out.println("Быть мужиком - это круто");
        }
        if(pol != true){
            System.out.println("Who runs the world- GIRLS");
        }
        if(rost < 1.80){
            System.out.println("Быть длинным это смотреть с высока на низких");
        } else {
            System.out.println("Быть низким не так уж плохо ");
        }
        if(firstName == 'M'){
            System.out.println("ты случайно не Миша?");
        } else if(firstName == 'I') {
            System.out.println("Привет Ира ");
        } else {
            System.out.println("Красивое имя");
        }
    }
}