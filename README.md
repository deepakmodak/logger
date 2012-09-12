Logger
-------
Daily Log Backups

* This sample application will allow to generate logs on both console and file.
* Two Appenders are used to display logs on console and write logs in file.
* ConversionPattern will allow to have desired format of the log roll.

----------------------------------------------------------------------------------
Console:
log4j has ConsoleAppender to display logs [info,error etc] on console 

<appender name="default" class="org.apache.log4j.ConsoleAppender">
    <param name="target" value="System.out" />
    <layout class="org.apache.log4j.PatternLayout">
      <param name="ConversionPattern" value="[%p] %d{dd MMM hh:mm:ss aa} %t [%l] %m%n" />
    </layout>
</appender>
------------------------------------------------------------------------------------  
File:
It will write logs into file named "logreport.log". It can be found inside logs folder of application.
It will generate logs daily basis.On change of system date,it will rename old log file with appending
system date(format .yyyy-MM-dd) at the end.

 <appender name="file" class="org.apache.log4j.DailyRollingFileAppender">
  	<param name="File" value="logs/logreport.log" />
	    <param name="threshold" value="info" />
		<param name="Append" value="true" />
		<param name="DatePattern" value="'.'yyyy-MM-dd" />
		<layout class="org.apache.log4j.PatternLayout">
		  <param name="ConversionPattern" value="[%p] %d{dd MMM hh:mm:ss aa} %t [%l] %m%n" />
		</layout>
	</appender>
---------------------------------------------------------------------------------------------

If using struts or other framework and want to diasble logs generated by them then use

	<logger name="com.opensymphony.xwork2">
      <level value="OFF" />
	</logger>

	<logger name="freemarker.cache">
	    <level value="OFF" />
	</logger>

	<logger name="freemarker.beans">
	    <level value="OFF" />
	</logger>

	<logger name="org.apache.struts2">
	    <level value="OFF" />
	</logger>

