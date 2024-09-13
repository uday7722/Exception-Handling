package customexception;

public class WrongPasswordException extends RuntimeException {
	private String message;
	WrongPasswordException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}

}
