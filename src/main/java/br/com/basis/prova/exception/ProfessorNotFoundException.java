package br.com.basis.prova.exception;

public class ProfessorNotFoundException extends Exception {

	private static final long serialVersionUID = -7630009569979446777L;

	public ProfessorNotFoundException() {
		super();
	}

	public ProfessorNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProfessorNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProfessorNotFoundException(String message) {
		super(message);
	}

	public ProfessorNotFoundException(Throwable cause) {
		super(cause);
	}

}
