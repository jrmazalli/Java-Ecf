package br.com.ecoded.ecf.fiscal.exception;

/**
 * Exceção a ser lançada na ocorrência de falhas provenientes do ecf.
 */
public class EcfException extends Exception {

	private static final long serialVersionUID = 8157032997005835424L;
	
	String message;
	
	/**
	 * Construtor da classe.
	 * 
	 * @param e
	 */
	public EcfException(Throwable e) {
		super(e);
	}

	
	/**
	 * Construtor da classe.
	 * 
	 * @param code
	 */
	public EcfException(String message) {
		this((Throwable) null);
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	
}