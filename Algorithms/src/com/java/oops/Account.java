package com.java.oops;

public class Account 
{
	String Name        = "SUPREETH B H";
    long AccNum        =  8055324l;
    static String Bank = "CANARA BANK";
    String Branch      = "Amruthur";
    String AccType     = "Savings";
    double Balance     =  2000.00;
    
    public String deposit(int amt)
    {
    	if(amt>0)
    	{
    		Balance =Balance + amt;
    		return "The amount has been deposited to your Account";
	    }
       return "The amount has not been deposited";
    }

    public String withdraw(double amt)
    {
    	if(amt>0 && amt<Balance)
    	{
    		Balance = Balance - amt;
    		return "The amount was withdrawn from your Account";
    	}
       return "Insufficient Balance to withdraw the amount";
    }

    public void checkBalance()
    {
    	System.out.println("The balance is -->" +Balance);
    }

    public static void dispBalance()
    {
    	System.out.println("Bank -->" +Bank);
    }

    public void dispAccDetais()
    {
    	System.out.println(Name);
    	System.out.println(AccNum);
    	System.out.println(Bank);
    	System.out.println(Branch);
    	System.out.println(AccType);
    	System.out.println(Balance);
    }
}
