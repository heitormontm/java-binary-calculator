import javax.swing.JOptionPane;

public class BinarySum {

	public static void main(String[] args) {
		
		StringBuilder binary = new StringBuilder();
		
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
		
		int i = a.length() - 1, j = b.length() - 1;
		int carry = 0;
		
		while(i >= 0 || j >= 0) {
			int sum = carry;
			
			if(i >= 0) {
				sum += a.charAt(i) - '0';
			}
			
			if(j >= 0) {
				sum += b.charAt(j) - '0';
			}
			
			binary.append(sum % 2);
			carry = sum / 2;
			i--;
			j--;
			
		}
		
		if(carry > 0) {
			binary.append(carry);
		}
		
		String binarySum = binary.reverse().toString();
		
		JOptionPane.showMessageDialog(
                null,
                "The sum of these numbers is: " + binarySum,
                "Addition Result",
                JOptionPane.INFORMATION_MESSAGE
            );
		
	}

}
