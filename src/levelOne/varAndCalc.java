package levelOne;

import java.util.Scanner;

public class varAndCalc {
    public static void main(String[] args) throws InterruptedException {

        IntegersAndFloats intOne = new IntegersAndFloats();
        Strings strOne = new Strings();

        intOne.getPlusA();
        intOne.getPlusB();
        int sum = intOne.getPlusA() + intOne.getPlusB();
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
            if (sum == 1){
                System.out.println(sum++ + " " + strOne.h);
                Thread.sleep(400);
            } else if (sum > 1 && sum <= 60) {
                    System.out.println(sum++ + " " + strOne.g);
                    Thread.sleep(400);
            } else if (sum == 59) {
                System.out.println("Finish");
                System.exit(1);
            }
        }

    }
}

