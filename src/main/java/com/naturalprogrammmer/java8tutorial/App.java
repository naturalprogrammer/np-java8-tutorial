package com.naturalprogrammmer.java8tutorial;

import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( process("Hello World!", str -> str.toLowerCase()) );
    }

	private static String process(String str, Function<String, String> processor) {
		
		return processor.apply(str);
	}
}
