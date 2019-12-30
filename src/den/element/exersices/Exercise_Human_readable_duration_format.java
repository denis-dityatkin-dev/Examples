package den.element.exersices;

// Преобразование числа общей суммы секунд в часы, минуты и секунды

public class Exercise_Human_readable_duration_format {

        public static void main(String[] args) {

            int seconds1 = 62;
            int seconds2 = 3662;

            System.out.println(timeConversion(seconds1));
            System.out.println(timeConversion(seconds2));

        }

        private static String timeConversion(int totalSeconds) {

            final int MINUTES_IN_AN_HOUR = 60;
            final int SECONDS_IN_A_MINUTE = 60;

            int seconds = totalSeconds % SECONDS_IN_A_MINUTE;
            int totalMinutes = totalSeconds / SECONDS_IN_A_MINUTE;
            int minutes = totalMinutes % MINUTES_IN_AN_HOUR;
            int hours = totalMinutes / MINUTES_IN_AN_HOUR;

            return hours + " hours " + minutes + " minutes and " + seconds + " seconds";
        }


    }

