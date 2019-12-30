package den.element.exersices;

// Вывод линейного массива чисел с плавающей точкой с ограничением до 2х знаков после запятой с заданными числами
public class Exercise_5 {
    public static void main(String[] args) {
        double[] x, y;

        x = new double [6];
        y = new double [6];

        x[0] = 3.141667;
        x[1] = 2.72345;
        x[2] = 6.722;
        x[3] = -2.34161;
        x[4] = 1.2;
        x[5] = 1235;
        y[0] = 0;

        for (int i = 0; i < x.length; i++) {

                       System.out.println(String.format("%.2f", x[i]));
        }
        // Вывод линейного массива чисел с плавающей точкой с ограничением до 2х знаков после запятой с пустым массивом

        for (int i = 1; i < y.length; i++) {
            y[i] = y[i-1] + 0.1;
            System.out.println(String.format("%.2f", y[i]));
        }

    }

    }

