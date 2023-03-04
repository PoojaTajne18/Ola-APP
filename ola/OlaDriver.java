package com.jsp.ola;

import java.util.Scanner;

public class OlaDriver
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
olaApplication op=new olaApplication();
 for(;;)
 {
	
	 System.out.println("1.login 2.logout 3.makeride 4.exit");
 
   switch(sc.nextInt())
   {
   case 1: op.login();
   break;
   case  2:op.logout();
   break;
   case 3: op.Makeride();
   break;
   case 4:op.cancelride();
   break;
   case 5:op.markABill();
   break;
   case 6:System.exit(0);
   
   }
 
 }
 
	
	}

}
