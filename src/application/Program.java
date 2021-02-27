package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void main (String[] args) {
		
		Account ac = new Account(1001, "Alex", 0.0);
		BusinessAccount bac = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account ac1 = bac;
		Account ac2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account ac3 = new SavingsAccount(100, "Ana", 0.0, 0.01);
		
		//DOWNCASTING
		
		//BusinessAccount ac4 = ac2; <- ERRO: variável AC2 (Account) não pode ser convertido para BusinessAccount. Necessário Casting manual.
		BusinessAccount ac4 = (BusinessAccount)ac2;
		ac4.loan(100.0);
		
		//BusinessAccount ac5 = (BusinessAccount) ac3; <- ERRO: AC3(SavingsAccount) não pode ser convertida para BusinessAccount
		if(ac3 instanceof BusinessAccount) {
			BusinessAccount ac5 = (BusinessAccount) ac3;
			ac5.loan(200.0);
			System.out.println("Loan!");
		}
		if(ac3 instanceof SavingsAccount) {
			SavingsAccount ac5 = (SavingsAccount) ac3;
			ac5.updateBalance();
			System.out.println("Update!");
		}
	}

}
