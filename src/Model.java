public class Model {
    public int getDaysPassed(int day, int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
            throw new IllegalArgumentException("Неверные входные данные");
        }

        int daysPassed = day;
        for (int i = 0; i < month - 1; i++) {
            daysPassed += daysInMonth[i];
        }

        return daysPassed;
    }
}