package den.element.exersices;

// Определение натуральных и не натуральных чисел

public class Exercise_By_3_or_not_By_3 {



          public static void main(String[] args) {

            int x [] = new int[5];

              x[0] = 123;
              x[1] = 8409;
              x[2] = 100853;
              x[3] = 33333333;
              x[4] = 7;

              for (int j = 0; j < x.length; j++) {
                  if (!(x[j] % 3 != 0)) {
                      System.out.println("Число " + x[j] + " - натуральное");
                  } else {
                      System.out.println("Число " + x[j] + " - не натуральное");
                  }
              }

        }

    }
