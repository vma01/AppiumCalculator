package enums;

/**
 * Created by v.matviichenko
 */
public enum MathOperations {
	PLUS("op_add"),
	MINUS("op_sub"),
	SIN("fun_sin"),
	PI("const_pi"),
	MULTIPLY("op_mul"),
	LEFT_PARENTHESES("lparen"),
	RIGHT_PARENTHESES("rparen"),
	DIVIDE("op_div");

	private String id;

	MathOperations(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
