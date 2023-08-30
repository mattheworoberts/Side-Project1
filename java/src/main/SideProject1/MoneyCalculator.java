package SideProject1;

/**
* The MoneyCalculator class implments static methods to calculate the amount of pennies, nickels, dimes, and quarters in their denomination
* and return the value
*
* @author  John H. Freeman
* @version 1.0
* @since   2023-30-08
*/
public class MoneyCalculator {

    /**
     * @author
     * @version
     * @since
     */
    final static double PENNIES_VAL = .01, NICKELS_VAL = .05, DIMES_VAL = .10, QUARTER_VAL = .25;

    /**
     * calculate value in pennies
     * @param n number of pennies
     * @return double value of pennies 
     */
    public static double CalculatePenniesTotal(int n)
    {
        return PENNIES_VAL * n;
    }

    /**
     * calculate value of the number of nickels
     * @param n number of nickels
     * @return double the value of nickels based on the quantity given
     */
    public static double CalculateNickelsTotal(int n)
    {
        return NICKELS_VAL * n;
    }

    /**
     * calculate the value of the number of dimes
     * @param n number of dimes
     * @return double the value of the quantity of dimes given
     */
    public static double CalculateDimesTotal(int n)
    {
        return n * DIMES_VAL;
    }

    /**
     * calculate the value of the number of quaters
     * @param n number of quaters
     * @return double the value of the quantity of quaters given
     */
    public static double CalculateQuartersTotal(int n)
    {
        return QUARTER_VAL * n;
    }

    /**
     * total of the number of quantity 
     * @param nOfPennies number of pennies
     * @param nOfNickels number of nickels
     * @param nOfDimes number of dimes
     * @param nOfQuarters number of quaters
     * @return double total of quantity of coin denomination given
     */
    public static double CalculateCoinTotal(int nOfPennies, int nOfNickels, int nOfDimes, int nOfQuarters)
    {
        return MoneyCalculator.CalculatePenniesTotal(nOfPennies) + MoneyCalculator.CalculateNickelsTotal(nOfNickels) + MoneyCalculator.CalculateDimesTotal(nOfDimes) + MoneyCalculator.CalculateQuartersTotal(nOfQuarters);
    }
}
