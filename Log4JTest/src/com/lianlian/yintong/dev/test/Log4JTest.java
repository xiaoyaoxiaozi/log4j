package com.lianlian.yintong.dev.test;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4JTest {

	public   static   void  main(String[] args)  {
        PropertyConfigurator.configure( "D:/Workspaces/MyEclipse 10/Test001/src/log4j.properties " );
        Logger logger  =  Logger.getLogger(Log4JTest.class );
        logger.debug( " debug " );
        logger .info("test");   
        logger.error( " error " );  
    }       
}
