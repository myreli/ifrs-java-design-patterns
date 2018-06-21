/**
 * 
 */
package com.model;

/**
 * @author myreli
 *
 */
public class TurkeyAdapter implements Duck {

	Turkey turkey;
	
	/**
	 * @param turkey
	 */
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	/* (non-Javadoc)
	 * @see com.model.Duck#quack()
	 */
	@Override
	public void quack() {
		this.turkey.gobble();
	}

	/* (non-Javadoc)
	 * @see com.model.Duck#fly()
	 */
	@Override
	public void fly() {
		for(int i = 0; i < 5; i++)
			this.turkey.fly();
	}
	
}
