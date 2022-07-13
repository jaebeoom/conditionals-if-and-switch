package com.in28minutes.ifstatement.examples;

public class SwitchExerciesRunner {
    public static void main(String[] args) {
        System.out.println(determineNameOfDay(1));
        System.out.println(determineNameOfMonth(1));
        System.out.println(isWeekDay(1));
    }
        public static String determineNameOfDay (int dayNum) {
            switch (dayNum) {
                case 0:
                    return "Sunday";
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Satday";
            }
            return "Invalid Day";
        }

        public static String determineNameOfMonth (int monthNum) {
            switch (monthNum) {
                case 1:
                    return "This month is Jan";
                case 2:
                    return "This month is Feb";
                case 3:
                    return "This month is Mar";
                case 4:
                    return "This month is Apr";
                case 5:
                    return "This month is May";
                case 6:
                    return "This month is Jun";
                case 7:
                    return "This month is Jul";
                case 8:
                    return "This month is Aug";
                case 9:
                    return "This month is Sep";
                case 10:
                    return "This month is Oct";
                case 11:
                    return "This month is Nov";
                case 12:
                    return "This month is Dec";
            }
            return "Invalid Month";
        }

        public static boolean isWeekDay(int dayNum) {
            switch (dayNum) {
                case 0:
                case 6:
                    return false;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5: return true;
            }
            return false;
    }
}