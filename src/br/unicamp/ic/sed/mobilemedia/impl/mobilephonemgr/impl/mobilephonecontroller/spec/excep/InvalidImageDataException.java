package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.excep;

public class InvalidImageDataException extends Exception {

	private Throwable cause;
	
	public InvalidImageDataException() {
		super();
	}

	public InvalidImageDataException(String arg0) {
		super(arg0);
	}
	
	public InvalidImageDataException(Throwable arg0) {
		cause = arg0;
	}
	
	public Throwable getCause(){
		return cause;
	}
}
