package den.element.exersices;

// Определение максимального числа из 2-х

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число: ");
        String a = reader.readLine();
        System.out.println("Введите второе число: ");
        String b = reader.readLine();

        int a_1 = Integer.parseInt(a);
        int b_1 = Integer.parseInt(b);

        if (a_1 > b_1){
            System.out.println("Максимальное число = " + a_1);
        }else if (a_1 == 0 && b_1 == 0){
            System.out.println("Это 0");
        }
        else {
            System.out.println("Максимальное число = " + b_1);
        }
    }
}
