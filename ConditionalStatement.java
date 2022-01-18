public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 10;
        double length = 1.60;
        char male = 'M';
        char firstLetterName = 'M';
        if(age > 20) {
            System.out.println("Стареешь больше 20и");
        }
        
        if(male == 'M') {
            System.out.println("Быть мужиком - это круто");
        }
        
        if(male != 'M') {
            System.out.println("Who runs the world- GIRLS");
        }
        
        if(length < 1.80) {
            System.out.println("Быть длинным это смотреть с высока на низких");
        } else {
            System.out.println("Быть низким не так уж плохо ");
        }
        
        if(firstLetterName == 'M') {
            System.out.println("ты случайно не Миша?");
        } else if(firstLetterName == 'I') {
            System.out.println("Привет Ира ");
        } else {
            System.out.println("Красивое имя");
        }
    }
}