/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns.accounts;

import java.math.BigDecimal;

/**
 *
 * @author 20114
 */
public class Chequing extends BankAccount {

    public Chequing(BigDecimal initAmount) {
        super(initAmount);
    }

    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);
        System.out.println("Deposite Suceeded\nChequing balnce:  " + super.balance);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        super.withdraw(amount);
        System.out.println("Withdraw Suceeded\nChequing balnce:  " + super.balance);
    }

    @Override
    public void transfer(BigDecimal amount) {
        super.transfer(amount);
        System.out.println("Transfer Suceeded\nChequing balnce:  " + super.balance);
    }

}
