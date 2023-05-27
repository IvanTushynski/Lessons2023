package levelOne;

public class varAndCalc {
    public static void main(String[] args) {

        Integers intOne = new Integers();
        Strings strOne = new Strings();

        intOne.setPlusA();
        intOne.setPlusB();
        int sum = intOne.setPlusA() + intOne.setPlusB();
        if (sum > 0){
            System.out.print("------------\nSUM:");
            System.out.println(" " + sum);
        } else{
            System.out.print("------------\nSUM:");
            System.out.print(" " + "Wrong Number!!!");
        };
    }
}

