/**
 * 
 */
package com.presentation;

import com.model.Duck;
import com.model.MallardDuck;
import com.model.TurkeyAdapter;
import com.model.WildTurkey;

/**
 * @author myreli
 *
 */
public class TurkeyAdapterTest {

	public static void main(String[] args) {
		
		MallardDuck duck 	= new MallardDuck();
		WildTurkey turkey 	= new WildTurkey();
		
		Duck turkeyAdapter 	= new TurkeyAdapter(turkey);
		
		System.out.println("turkey: ");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nduck: ");
		testDuck(duck);
		
		System.out.println("\nturduck: ");
		testDuck(turkeyAdapter);
		
		
		
	}

	/**
	 * @param duck
	 */
	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
}
