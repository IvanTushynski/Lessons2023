package levelOne;

import java.util.Scanner;

public class testRunSetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IntegersAndFloats cAndD = new IntegersAndFloats();

        try {

            System.out.print("Первое Число: ");
            cAndD.setC(scanner.nextInt());

            System.out.print("Второе Число: ");
            cAndD.setD(scanner.nextInt());

            //1%------------------------------------------------
            float onePercent = (cAndD.getC() + cAndD.getD())/100;
            System.out.println("Один % равен: " + onePercent);
            System.out.print("Укажите %: ");

            float percents = scanner.nextInt();

            System.out.println("Ваш Результат: " + onePercent * percents + "%");
        } catch (Exception e) {
            System.out.print("Неверное Число!!!");
        }

    }

}
