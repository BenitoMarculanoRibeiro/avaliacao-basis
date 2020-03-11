package br.com.basis.prova.exception;

public class DisciplinaResourceException extends Exception {

	private static final long serialVersionUID = -6681777147239341684L;

	public DisciplinaResourceException() {
		super();
	}

	public DisciplinaResourceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DisciplinaResourceException(String message, Throwable cause) {
		super(message, cause);
	}

	public DisciplinaResourceException(String message) {
		super(message);
	}

	public DisciplinaResourceException(Throwable cause) {
		super(cause);
	}
}
