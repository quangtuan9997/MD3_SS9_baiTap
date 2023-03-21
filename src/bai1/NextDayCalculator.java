package bai1;

public class NextDayCalculator {
    public static String nextDay(int day, int mouth, int year) {
        if (mouth == 2) {
            if (year == 2018) {
                if (day >= 1 && day < 28) {
                    day++;
                } else if (day == 28) {
                    day = 1;
                    mouth++;
                }
            } else if (year == 2020) {
                if (day >= 1 && day < 29) {
                    day++;
                } else if (day == 29) {
                    day = 1;
                    mouth++;
                }
            }

        } else {
            if (day >= 1 && day < 30) {
                day++;
            } else {
                if (mouth == 1 || mouth == 3 || mouth == 5 || mouth == 7 || mouth == 8 || mouth == 10) {
                    if (day == 31) {
                        day = 1;
                        mouth++;

                    }
                } else if (mouth == 4 || mouth == 6 || mouth == 9 || mouth == 11) {
                    if (day == 30) {
                        day = 1;
                        mouth++;

                    }
                } else if (mouth == 12) {
                    if (day == 31) {
                        day = 1;
                        mouth = 1;
                        year++;
                    }
                }

            }
        }
        return day + "/" + mouth + "/" + year;
    }
}
