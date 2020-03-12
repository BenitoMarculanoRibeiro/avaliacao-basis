package br.com.basis.prova.exception;

public class AlunoResourceException extends Exception {

	private static final long serialVersionUID = -6681777147239341684L;

	public AlunoResourceException() {
		super();
	}

	public AlunoResourceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AlunoResourceException(String message, Throwable cause) {
		super(message, cause);
	}

	public AlunoResourceException(String message) {
		super(message);
	}

	public AlunoResourceException(Throwable cause) {
		super(cause);
	}
}
