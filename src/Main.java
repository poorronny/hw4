public class Main {
    public static void main(String[] args) {
        //task1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {

            System.out.print(a + " ");
        }
        System.out.println();

        //task2
        int firstFriday = 3;
        int daysInMonth = 31;
        for (int friday = firstFriday; friday <= daysInMonth; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт. ");
        }
        //task3

        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int cometVisibility = 79;
        int firsAppearedYear = 0;

        for (int year = firsAppearedYear; year <= end; year += cometVisibility) {
            if (year >= start) {
                System.out.println(year);
            }
        }

    }
}
