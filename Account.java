import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * The Account class represents a bank account for a customer, allowing
 * operations such as deposits and withdrawals on checking and saving accounts.
 * It includes methods for calculating balances and handling user input for transactions.
 */
public class Account {

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    /**
     * Sets the customer number associated with this account.
     *
     * @param customerNumber The unique customer number.
     */
    public void setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
    }

    /**
     * Retrieves the customer number associated with this account.
     *
     * @return The customer number.
     */
    public int getCustomerNumber(){
        return customerNumber;
    }

    /**
     * Sets the PIN number for this account.
     *
     * @param pinNumber The PIN number.
     */
    public void setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
    }

    /**
     * Retrieves the PIN number for this account.
     *
     * @return The PIN number.
     */
    public int getPinNumber(){
        return pinNumber;
    }

    /**
     * Retrieves the current checking account balance.
     *
     * @return The checking account balance.
     */
    public double getCheckingBalance() {
        return checkingBalance;
    }

    /**
     * Retrieves the current saving account balance.
     *
     * @return The saving account balance.
     */
    public double getSavingBalance(){
        return savingBalance;
    }

    /**
     * Calculates a new checking balance after a withdrawal.
     *
     * @param amount The amount to withdraw from the checking account.
     */
    public void calcCheckingWithdraw(double amount){
        checkingBalance -= amount;
    }

    /**
     * Calculates a new saving balance after a withdrawal.
     *
     * @param amount The amount to withdraw from the saving account.
     */
    public void calcSavingWithdraw(double amount){
        savingBalance -= amount;
    }

    /**
     * Calculates a new checking balance after a deposit.
     *
     * @param amount The amount to deposit into the checking account.
     */
    public void calcCheckingDeposit(double amount){
        checkingBalance += amount;
    }

    /**
     * Calculates a new saving balance after a deposit.
     *
     * @param amount The amount to deposit into the saving account.
     */
    public void calcSavingDeposit(double amount){
        savingBalance += amount;
    }

    /**
     * Prompts the user for a withdrawal amount from the checking account and processes
     * the transaction if there are sufficient funds. Displays the new balance if successful.
     */
    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if(checkingBalance - amount >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("Not Enough Money to Withdraw");
        }
    }

    /**
     * Prompts the user for a withdrawal amount from the saving account and processes
     * the transaction if there are sufficient funds. Displays the new balance if successful.
     */
    public void getSavingWithdrawInput() {
        System.out.println("Saving Account balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if(savingBalance - amount >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
        }
        else{
            System.out.println("Not Enough Money to Withdraw");
        }
    }

    /**
     * Prompts the user for a deposit amount into the checking account and processes
     * the transaction. Displays the new balance if successful.
     */
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit to Checking Account: ");
        double amount = input.nextDouble();

        if(checkingBalance + amount >= 0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("No Money to Deposit");
        }
    }

    /**
     * Prompts the user for a deposit amount into the saving account and processes
     * the transaction. Displays the new balance if successful.
     */
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to deposit to Saving Account: ");
        double amount = input.nextDouble();

        if(savingBalance + amount >= 0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
        }
        else{
            System.out.println("No Money to Deposit");
        }
    }
}
