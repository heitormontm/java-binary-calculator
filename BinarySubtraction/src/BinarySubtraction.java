import javax.swing.JOptionPane;

public class BinarySubtraction {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog(
                null,
                "Type the first binary number:",
                "Binary Calculator",
                JOptionPane.QUESTION_MESSAGE
            );
		
		String b = JOptionPane.showInputDialog(
                null,
                "Type the second binary number:",
                "Binary Calculator",
                JOptionPane.QUESTION_MESSAGE
            );
		
		int maxLen = Math.max(a.length(), b.length());
		
		a = String.format("%" + maxLen + "s", a).replace(' ', '0');
		b = String.format("%" + maxLen + "s", b).replace(' ', '0');
		
		StringBuilder result = new StringBuilder();
		int borrow = 0;
		
		for(int i = maxLen - 1; i>=0; i--) {
			int bitA = a.charAt(i) - '0' - borrow;
			int bitB = b.charAt(i) - '0';
			
			if(bitA < bitB) {
				bitA += 2;
				borrow = 1;
			} else {
				borrow = 0;
			}
			
			int diff = bitA - bitB;
			result.append(diff);
		}
		
		String binaryResult = result.reverse().toString().replaceFirst("^0+(?!$)", "");
		
		JOptionPane.showMessageDialog(
                null,
                "The subtraction result is: " + binaryResult,
                "Subtraction Result",
                JOptionPane.INFORMATION_MESSAGE
            );		
	}

}
