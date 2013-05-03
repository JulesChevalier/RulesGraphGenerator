/**
 * Exception thrown if a triple is not well formatted 
 *
 * @author Jules Chevalier
 */
public class TripleFormatException extends Exception {

	private static final long serialVersionUID = -6890899836743047318L;

	/**
	 * Class constructor
	 */
	public TripleFormatException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Exception methods 
	 **/
	
	public TripleFormatException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public TripleFormatException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TripleFormatException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public TripleFormatException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
