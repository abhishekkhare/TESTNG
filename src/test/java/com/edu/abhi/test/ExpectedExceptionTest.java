package com.edu.abhi.test;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
   String message = "Manisha";	
   MessageUtil messageUtil = new MessageUtil(message);
	   
   @Test(expectedExceptions = ArithmeticException.class)
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      messageUtil.printMessageException();     
   }
   
}
