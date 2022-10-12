public class Main {
    public static void main(String[] args) {

        //Массивы ч.1 Задача 1
        System.out.println("Массивы ч.1 Задача 1");

        byte[] аrray = new byte[12];  // По умолчанию все оставшиеся ячейки заполнены нулем, не вижу смысла их объявлять
        аrray[0] = 1;
        аrray[1] = 2;
        аrray[2] = 3;
        double[] fractionАrray = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        short[] fiboArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377};
        System.out.println(аrray[2] + "\n" + fractionАrray[1] + "\n" + fiboArray[5] + "\n");

        //Массивы ч.1 Задача 2
        System.out.println("Массивы ч.1 Задача 2");

        System.out.print("Решение 1 массива: ");
        for (byte ex1 = 0; ex1 < аrray.length; ex1++)
            System.out.print(аrray[ex1] + ", ");
        System.out.println();

        System.out.print("Решение 2 массива: ");
        for (byte ex2 = 0; ex2 < fractionАrray.length; ex2++)
            System.out.print(fractionАrray[ex2] + ", ");
        System.out.println();

        System.out.print("Решение 3 массива: ");
        for (byte ex3 = 0; ex3 < fiboArray.length; ex3++)
            System.out.print(fiboArray[ex3] + ", ");
        System.out.println();
        System.out.println();

        //Массивы ч.1 Задача 3
        System.out.println("Массивы ч.1 Задача 3");

        System.out.print("Решение 1 массива: ");
        for (int ex4 = аrray.length - 1; ex4 >= 0; ex4--)
            System.out.print(ex4 > 0 ? аrray[ex4] + ", " : аrray[ex4]);
        System.out.println();

        System.out.print("Решение 2 массива: ");
        for (int ex5 = fractionАrray.length - 1; ex5 >= 0; ex5--)
            System.out.print(ex5 > 0 ? fractionАrray[ex5] + ", " : fractionАrray[ex5]);
        System.out.println();

        System.out.print("Решение 3 массива: ");
        for (int ex6 = fiboArray.length - 1; ex6 >= 0; ex6--)
            System.out.print(ex6 > 0 ? fiboArray[ex6] + ", " : fiboArray[ex6] + "\n");
        System.out.println();

        //Массивы ч.1 Задача 4
        System.out.println("Массивы ч.1 Задача 4");

        for (int ex7 = 0; ex7 < аrray.length; ex7++)
            System.out.print(аrray[ex7] % 2 != 0 ? аrray[ex7] + 1 + ", " : аrray[ex7] + ", ");
        System.out.println();
/*
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        - Критерии оценки
                - Все нечетные числа в целочисленном массиве четные с помоущью прибавления 1
                - В консоли распечатан только целочисленный массив
*/
    }
}