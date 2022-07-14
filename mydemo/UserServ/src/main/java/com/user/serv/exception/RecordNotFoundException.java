package com.user.serv.exception;

public class RecordNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 2L;

	public RecordNotFoundException(String s) {
		super(s);
	}

}
