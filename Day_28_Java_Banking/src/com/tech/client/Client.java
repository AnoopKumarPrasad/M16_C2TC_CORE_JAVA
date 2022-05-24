package com.tech.client;

import com.tech.application.MMBankFactory;
import com.tech.application.MMCurrentAcc;
import com.tech.application.MMSavingsAcc;
import com.tech.framework.SavingAcc;
import com.tech.framework.BankFactory;
import com.tech.framework.CurrentAcc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory s = new MMBankFactory();
		SavingAcc p=new MMSavingsAcc(1,"Anoop",1000,true);
		CurrentAcc n=new MMCurrentAcc(2,"Ram",1500,10);
		
		System.out.println("Prime account ");
		p.withdraw(p.getAccBal());
		System.out.println("Normal account");
		n.withdraw(n.getAccBal());
		System.out.println(p);
		System.out.println(n);
		}

	}

