package den.element.exersices;

// Определение текущего века по заданному году

public class Exercise_2 {
    public static void main(String[] args) {
        int year = 2019;
        int century = year / 100;
        if(century % 100 != 0)
            century++;
        System.out.println("Текущий век - это  " + century);
        System.out.println("Тест");
    }


}
