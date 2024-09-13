package customexception;

public class WrongPinException extends RuntimeException{
	private String message;
	
	WrongPinException(String message){
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
