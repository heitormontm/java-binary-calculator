import javax.swing.JOptionPane;

public class BinaryToDec {

    public static void main(String[] args) {

        try {
            String input = JOptionPane.showInputDialog(
                null,
                "How many bits is the binary number?",
                "Binary Calculator",
                JOptionPane.QUESTION_MESSAGE
            );

            int bits = Integer.parseInt(input);

            long[] bin = new long[bits];

            for (int i = 0; i < bin.length; i++) {
                String c = JOptionPane.showInputDialog(
                    null,
                    "Type the " + (i + 1) + "° bit (0 or 1):",
                    "Binary Calculator",
                    JOptionPane.QUESTION_MESSAGE
                );

                long bit = Long.parseLong(c);
                if (bit != 0 && bit != 1) {
                    throw new IllegalArgumentException("Only 0 or 1 are allowed.");
                }

                bin[i] = bit;
            }

            int decimal = 0;
            for (int i = 0; i < bin.length; i++) {
                decimal += bin[i] * Math.pow(2, bits - 1 - i);
            }

            StringBuilder r = new StringBuilder();
            for (long b : bin) {
                r.append(b);
            }

            JOptionPane.showMessageDialog(
                null,
                "The binary number " + r +
                " converted to decimal is: " + decimal,
                "Conversion Result",
                JOptionPane.INFORMATION_MESSAGE
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null,
                "Invalid input. Please enter only binary digits (0 or 1).",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}