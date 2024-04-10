package warzone.model;

/**
 * This interface abstract the action of Observer in Observer pattern.
 * @author Harsh
 * @version 1.1
 */
public interface Observer {
	/**
	 * This method will update the state of the observer.
	 * @param p_observable the observable object
	 */
	public void update(Observable p_observable);
}
