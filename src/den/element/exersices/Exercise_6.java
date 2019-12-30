package den.element.exersices;

// Подсчет суммы цифр числа

public class Exercise_6 {

            public static void main(String[] args) {

            int k = 123;
            int x = k;
            int s = 0;
            while (x != 0 ){
                s += x % 10;
                x /= 10;
            }
            System.out.println("Сумма цифр в числе " + k + " = " + s);
        }

    }
