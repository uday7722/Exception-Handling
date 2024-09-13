package customexception;

public class NotValidException extends RuntimeException {
	private String message;
	
	NotValidException(String message){
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

}
