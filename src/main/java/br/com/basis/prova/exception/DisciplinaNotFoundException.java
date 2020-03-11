package br.com.basis.prova.exception;

public class DisciplinaNotFoundException extends Exception {

	private static final long serialVersionUID = -7630009569979446777L;

	public DisciplinaNotFoundException() {
		super();
	}

	public DisciplinaNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DisciplinaNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public DisciplinaNotFoundException(String message) {
		super(message);
	}

	public DisciplinaNotFoundException(Throwable cause) {
		super(cause);
	}
}
