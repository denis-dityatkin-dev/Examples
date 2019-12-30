package den.element.exersices;

//Определение высокосного года

public class Exercise_3 {
    public static void main(String[] args) {
        int a = 1990;
        if (((a % 4 == 0) && (a % 100 !=0)) || (a % 400 == 0)){
            System.out.println("ГОд " + a + " - высокосный");
        }else {
            System.out.println("ГОд " + a + " -  не высокосный");
        }

    }
}
