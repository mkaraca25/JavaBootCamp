package kodlamaio.northwind.core.utilities.results;

public class successResult extends Result {
	public successResult() {
		super(true);
	}
	
public successResult(String message) {
		super(true,message);
	}
}
