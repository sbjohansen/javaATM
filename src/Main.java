import java.util.*;
import java.lang.*;
import java.io.*;

interface ATMInterface {
    void withdraw(int amount);
    void deposit(int amount);

    default void connectionToBank() {
        System.out.println("Connection to bank established");
    }

    static String connectionEnded() {
        return "Connection ended";
    }
}

class ATMImpl implements ATMInterface {
    public void withdraw(int amount) {
        System.out.println("Withdrawing " + amount + " from bank");
    }

    public void deposit(int amount) {
        System.out.println("Depositing " + amount + " from bank");
    }


}

public class Main {
    public static void main (String[] args)
    {

        ATMImpl atm = new ATMImpl();
        atm.connectionToBank();
        atm.withdraw(10);
        atm.deposit(10);
        System.out.println(ATMInterface.connectionEnded());



    }
}