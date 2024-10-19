/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.islam.design_patterns.accounts;

import java.math.BigDecimal;

/**
 *
 * @author 20114
 */
public interface IAccount {

    public void deposit(BigDecimal amount);

    public void withdraw(BigDecimal amount);

    public void transfer(BigDecimal amount);

    public BigDecimal getBalance();

    public String getAccountID();
}
