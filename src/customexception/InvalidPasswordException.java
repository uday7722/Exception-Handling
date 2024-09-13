package customexception;

public class InvalidPasswordException extends RuntimeException{ //1.have a class with ExceptionName 

	private String message;
	InvalidPasswordException(String message){
		this.message=message;

	}

	public String getMessage() {
		return message;
	}

}
