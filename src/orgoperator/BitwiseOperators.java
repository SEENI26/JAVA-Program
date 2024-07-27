package orgoperator;

public class BitwiseOperators {
	public static void main(String[] args) {
		int a = 10;
        int b = 20;
		int bitwiseAnd = a & b; // Bitwise AND
        int bitwiseOr = a | b; // Bitwise OR
        int bitwiseXor = a ^ b; // Bitwise XOR
        int bitwiseComplement = ~a; // Bitwise Complement
        int leftShift = a << 2; // Left shift
        int rightShift = a >> 2; // Right shift

        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + bitwiseAnd);
        System.out.println("a | b: " + bitwiseOr);
        System.out.println("a ^ b: " + bitwiseXor);
        System.out.println("~a: " + bitwiseComplement);
        System.out.println("a << 2: " + leftShift);
        System.out.println("a >> 2: " + rightShift);
	}
}
