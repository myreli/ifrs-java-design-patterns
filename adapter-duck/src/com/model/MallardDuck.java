/**
 * 
 */
package com.model;

/**
 * @author myreli
 *
 */
public class MallardDuck implements Duck {

	/* (non-Javadoc)
	 * @see com.model.Duck#quack()
	 */
	@Override
	public void quack() {
		System.out.println("quack... quack...");
		
	}

	/* (non-Javadoc)
	 * @see com.model.Duck#fly()
	 */
	@Override
	public void fly() {
		System.out.println("flying...");
	}
	
	
	
}
