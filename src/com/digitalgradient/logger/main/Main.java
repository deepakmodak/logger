package com.digitalgradient.logger.main;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Main {
	private static final Logger LOGGER =LoggerFactory.getLogger(Main.class);
	
	public static void main(String args[]) throws IOException {
	
		try{
			LOGGER.info("inside try block ");	
						 
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
		   LOGGER.error(ex.getMessage(),ex);
		}
		catch(Exception ex){
			  LOGGER.error(ex.getMessage(),ex);
		}
		LOGGER.info("ended");	
		
	}
}
