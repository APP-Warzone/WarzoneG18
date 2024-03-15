package warzone.model;

public enum ErrorType {
	NO_SUCH_COMMAND,
	MISSING_PARAMETER,
	MISSING_COMMAND,
	BAD_PARAMETER,
	BAD_OPTION,
	WRONG_PARAMETER,
	COMMAND_ERROR,
	TOO_MUCH_PARAMETERS;
	
	public String toStripackage warzone.model;

	/**
	 * There are eight types of error during the game.
	 *
	 */
	public enum ErrorType {
		NO_SUCH_COMMAND,
		MISSING_PARAMETER,
		MISSING_COMMAND,
		BAD_PARAMETER,
		BAD_OPTION,
		WRONG_PARAMETER,
		COMMAND_ERROR,
		TOO_MUCH_PARAMETERS;
		
		/**
		 * This method can print error type.
		 */
		public String toString() {
			return this.getClass().getName();
		}
	}
	ng() {
		return this.getClass().getName();
	}
}
