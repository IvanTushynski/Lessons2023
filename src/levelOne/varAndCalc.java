package levelOne;

import java.util.Scanner;

public class varAndCalc {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        Integers intOne = new Integers();
        Strings strOne = new Strings();

        intOne.setPlusA();
        intOne.setPlusB();
        int sum = intOne.setPlusA() + intOne.setPlusB();
        if (sum > 0){
            System.out.print("------------\nStart Number:");
            System.out.println(" " + sum);
        } else{
            System.out.print("------------\nSUM:");
            System.out.println(" " + "Wrong Number!!!");
        };

        strOne.g = "Seconds...";
        strOne.h = "Second...";
        for (int i = 1; i > 0; i++){
            if (sum == 1 && sum < 2){
                System.out.println(sum++ + " " + strOne.h);
                Thread.sleep(400);
            } else if (sum > 1 && sum <= 59) {
                    System.out.println(sum++ + " " + strOne.g);
                    Thread.sleep(400);
            } else if (sum > 59 && sum <= 60) {
                System.out.println("Finish");
                System.exit(1);
            }
        }

    }
}

