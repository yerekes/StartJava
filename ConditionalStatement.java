public class ConditionalStatement {
    public static void main(String[] args) {
        int vozr;
        float rost;
        char pol;
        char firstName;
        if(vozr > 20){
            System.out.println("Стареешь больше 20и");
        }
        if(pol = 'M'){
            System.out.println("Быть мужиком - это круто");
        }
        if(pol != 'M'){
            System.out.println("Who runs the world- GIRLS");
        }
        if(rost < 1.80){
            System.out.println("Быть длинным это смотреть с высока на низких");
        } else {
            System.out.println("Быть низким не так уж плохо ");
        }
        if(firstName == 'M'){
            System.out.println("ты случайно не Миша?");
        } else if(firsName == 'I') {
            System.out.println("Привет Ира ");
        } else {
            System.out.println("Красивое имя");
        }
    }
}