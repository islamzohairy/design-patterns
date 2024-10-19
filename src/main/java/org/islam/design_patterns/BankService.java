/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

import java.math.BigDecimal;
import java.util.HashMap;

import org.islam.design_patterns.accounts.Chequing;
import org.islam.design_patterns.accounts.IAccount;
import org.islam.design_patterns.accounts.Investment;
import org.islam.design_patterns.accounts.Saving;

/**
 *
 * @author 20114
 */
public class BankService {

    private final HashMap<String, IAccount> bankAccounts;

    public BankService() {
        this.bankAccounts = new HashMap<>();
    }

    // Create new acc
    public String createNewAccount(AccountType type, BigDecimal initAmount) {
        IAccount newAccount = null;

        switch (type) {
            case chequing ->
                newAccount = new Chequing(initAmount);

            case saving ->
                newAccount = new Saving(initAmount);

            case investment ->
                newAccount = new Investment(initAmount);

            default ->
                System.out.println("Invalid account type");
        }

        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountID(),
                    newAccount);
            return newAccount.getAccountID();
        }

        return "Invalid account type";
    }

    // Transfer money from acc A to acc B
    public void transferMoney(String fromID, String toID, BigDecimal amount) {
        IAccount fromAccount = this.bankAccounts.get(fromID);
        IAccount toAccount = this.bankAccounts.get(toID);

        fromAccount.transfer(amount);
        toAccount.deposit(amount);
    }

    // Deposite into account
    public void deposite(String accountID, BigDecimal amount) {
        IAccount account = this.bankAccounts.get(accountID);
        account.deposit(amount);
    }

    // Withdraw from account
    public void withdraw(String accountID, BigDecimal amount) {
        IAccount account = this.bankAccounts.get(accountID);
        account.withdraw(amount);
    }
}
