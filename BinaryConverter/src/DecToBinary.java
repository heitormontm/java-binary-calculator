import javax.swing.JOptionPane;

public class DecToBinary {

	public static void main(String[] args) {
		
		long x, r;
		try {
			String input = JOptionPane.showInputDialog(null, "Please type a decimal number", "Binary Calculator", JOptionPane.QUESTION_MESSAGE);
			
			x = Long.parseLong(input);
			
			int count = 0;
			StringBuilder bin = new StringBuilder();
			
			for (;x > 0; x = x / 2) {
				
				count += 1;
				
				r = x % 2;
				
				if(count == 0 && r == 1) {
					bin.append(r);
				} else if(count > 0 && r == 1 || r == 0) {
					bin.append(r);
				}
			}
			
			String binary = bin.reverse().toString();

            JOptionPane.showMessageDialog(
                null,
                "Binary: " + binary,
                "Conversion Result",
                JOptionPane.INFORMATION_MESSAGE
            );
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(
	                null,
	                "Error! Invalid input.",
	                "Error",
	                JOptionPane.ERROR_MESSAGE
	                );
		}

	}

}