/**
 * 
 */
package com.model;

/**
 * @author myreli
 *
 */
public class WildTurkey implements Turkey {

	/* (non-Javadoc)
	 * @see com.model.Turkey#gobble()
	 */
	@Override
	public void gobble() {
		System.out.println("gobble, gobble");
		
	}

	/* (non-Javadoc)
	 * @see com.model.Turkey#fly()
	 */
	@Override
	public void fly() {
		System.out.println("flying like a turkey");
	}

}
