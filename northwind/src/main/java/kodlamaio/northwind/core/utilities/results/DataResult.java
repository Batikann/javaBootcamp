package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {

	private T data;
	public DataResult(T data,boolean success, String Message) {
		super(success, Message);
		this.data=data;
	}
	
	public DataResult(T data,boolean success) {
		super(success);
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}

}
