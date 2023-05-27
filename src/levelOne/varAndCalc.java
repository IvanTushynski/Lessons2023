package levelOne;

public class varAndCalc {
    public static void main(String[] args) {

        Integers intOne = new Integers();
        Strings strOne = new Strings();

        intOne.a = 10;
        intOne.b = 30;

        System.out.println(intOne.a + intOne.b);


        intOne.a = 2;
        strOne.g = "+4=6";
        System.out.println(intOne.a + strOne.g);

    }
}

