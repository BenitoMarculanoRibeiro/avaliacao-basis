package br.com.basis.prova.exception;

public class ProfessorResourceException extends Exception {

	private static final long serialVersionUID = -6681777147239341684L;

	public ProfessorResourceException() {
		super();
	}

	public ProfessorResourceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProfessorResourceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProfessorResourceException(String message) {
		super(message);
	}

	public ProfessorResourceException(Throwable cause) {
		super(cause);
	}
}
