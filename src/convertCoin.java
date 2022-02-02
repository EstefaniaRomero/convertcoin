import java.util.Scanner;

public class convertCoin {

    private static final double DOLLAR_VALUE = 1.13;
    private static final double POUND_VALUE = 0.83;

    private static final int DOLLAR_OPTION = 1;
    private static final int POUND_OPTION = 2;

    public static void main(String[] args) {
     
      int option =  askTipeCoin();
      double avalaibleCash = coinValue();
      double convertTotal = converterCoin (avalaibleCash,option );
        printResult(convertTotal,option);

    }

    private static void printResult(double convertTotal, int option) {

        System.out.println("El resultat és: " + convertTotal );
    }

    private static double converterCoin (double avalaibleCash,int option) {

        double euros;
        if(option == DOLLAR_OPTION ){
            euros = avalaibleCash * DOLLAR_VALUE;
        } else {
            euros = avalaibleCash * POUND_VALUE;}

        return  euros;

    }

    private static int coinValue() {

        System.out.println("Quina quantitas d'euros vols convertir?");
        Scanner sc = new Scanner(System.in);
        int moneyValue = sc.nextInt();


        return moneyValue;
    }

    private static int askTipeCoin() {
        System.out.println(" En quina moneda vols convertir els euros: Dolars (1) o Pounds (2)");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        return option;
    }

}
