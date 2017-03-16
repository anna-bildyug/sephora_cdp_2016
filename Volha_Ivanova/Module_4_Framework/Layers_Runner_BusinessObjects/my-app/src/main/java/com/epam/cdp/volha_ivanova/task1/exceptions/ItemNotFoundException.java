package com.epam.cdp.volha_ivanova.task1.exceptions;

public class ItemNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 8470378839209537048L;

    public ItemNotFoundException(String errorMessage) {
        super( errorMessage );
    }

    public ItemNotFoundException(String message, Throwable cause) {
        super( message, cause );
    }
}
