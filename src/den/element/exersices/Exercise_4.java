package den.element.exersices;

// Заполнение одномерного целочисленного массива значениями от 1 до 10 включительно

public class Exercise_4 {

        public static void main(String[] args) {
            int[] mas1 = new int[10];
            int i = 1;
            for (int index: mas1) {

                mas1[index] = i;
                i++;
                System.out.println(mas1[index]);
            }

        }
    }
