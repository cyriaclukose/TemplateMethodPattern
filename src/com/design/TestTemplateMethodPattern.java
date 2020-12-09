package com.design;

public class TestTemplateMethodPattern {

	/**
	 * template method pattern is a behavioural pattern
	 * its is used when we need to do a certian steps in a specific order(algorithm)
	 * to get the solution
	 * the template method will contain the specific steps that need to be done
	 * the impleemntation should in the subclasses
	 * 
	 * @param args
	 */
	
	public static void main(String [] args)
	{
		
		System.out.println("play chess ----");
		
		Game chess=new Chess();
		
		chess.play();
		
		System.out.println("play soccer ----");
		
		Game soccer=new Soccer();
		
		
		soccer.play();
		
	}
}
