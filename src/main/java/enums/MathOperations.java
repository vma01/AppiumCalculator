package enums;

/**
 * Created by v.matviichenko
 */
public enum MathOperations {
	PLUS("op_add"),
	MINUS("op_sub"),
	DIVIDE("op_div"),
	MULTIPLY("op_mul");

	private String id;

	MathOperations(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
