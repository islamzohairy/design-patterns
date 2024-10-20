/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns.accounts;

import java.math.BigDecimal;
import java.util.UUID;

/**
 *
 * @author 20114
 */
public abstract class BankAccount implements IAccount {

    protected BigDecimal balance = BigDecimal.ZERO;
    private final String id;

    public BankAccount(BigDecimal initAmount) {
        this.balance = initAmount;
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public void deposit(BigDecimal amount) {
        this.balance = balance.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        this.balance = balance.subtract(amount);
    }

    @Override
    public void transfer(BigDecimal amount) {
        this.balance = balance.subtract(amount);
    }

    @Override
    public BigDecimal getBalance() {
        return this.balance;
    }

    @Override
    public String getAccountID() {
        return this.id;
    }

}
