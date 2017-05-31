package com.naturalprogrammmer.java8tutorial;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( process("Hello World!", new Processor() {

			public String process(String str) {
				
				return str.toLowerCase();
			}
        	
        }) );
    }

	private static String process(String str, Processor processor) {
		
		return processor.process(str);
	}
}

interface Processor {
	
	String process(String str);
}
