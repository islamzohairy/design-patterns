/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.islam.design_patterns;

import java.math.BigDecimal;

/**
 *
 * @author 20114
 */
public class DesignPatterns {

    public static void main(String[] args) {
        BankService bankService = new BankService();
        String mySavingAccountID = bankService.createNewAccount(AccountType.saving, BigDecimal.valueOf(0.00));
        String myInvestmentAccountID = bankService.createNewAccount(AccountType.investment, BigDecimal.valueOf(0.00));

        // Deposit to my saving acc
        bankService.deposite(mySavingAccountID, BigDecimal.valueOf(10000.00));
        System.out.println("");

        // Transfer some money to my investment acc
        bankService.transferMoney(mySavingAccountID, myInvestmentAccountID, BigDecimal.valueOf(2500.00));
        System.out.println("");

        // Withdraw from my saving acc
        bankService.withdraw(mySavingAccountID, BigDecimal.valueOf(1000.00));
    }
}
