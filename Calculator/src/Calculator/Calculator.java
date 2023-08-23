package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	// Initializing the screen

	private JFrame frame;
	private JTextField textField;

	// Number and operator values

	Double firstnumber = null;
	Double secondnumber = null;

	String operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.setBounds(100, 100, 341, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 305, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		// Numbers

		// '1'

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// The following two lines of code are how the number, 1 in this case, is shown
				// in the textfield.

				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 295, 50, 50);
		frame.getContentPane().add(btn1);

		// '2'

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 295, 50, 50);
		frame.getContentPane().add(btn2);

		// '3'

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(130, 295, 50, 50);
		frame.getContentPane().add(btn3);

		// '4'

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 234, 50, 50);
		frame.getContentPane().add(btn4);

		// '5'

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 234, 50, 50);
		frame.getContentPane().add(btn5);

		// '6'

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(130, 234, 50, 50);
		frame.getContentPane().add(btn6);

		// '7'

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 173, 50, 50);
		frame.getContentPane().add(btn7);

		// '8'

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 173, 50, 50);
		frame.getContentPane().add(btn8);

		// '9'

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(130, 173, 50, 50);
		frame.getContentPane().add(btn9);

		// '0'

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn0.getText();

				textField.setText(EnterNumber);

			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 356, 50, 50);
		frame.getContentPane().add(btn0);

		// Negative

		JButton btnNegative = new JButton("-");
		btnNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// The following code below ensures that the user can only type this symbol at
				// the beginning of a number

				if (textField.getText().isEmpty()) {

					String EnterNumber = textField.getText() + btnNegative.getText();
					textField.setText(EnterNumber);

				} else {
					textField.setText(null);
					String EnterNumber = textField.getText() + "Error";
					textField.setText(EnterNumber);

				}

			}
		});
		btnNegative.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNegative.setBounds(130, 356, 50, 50);
		frame.getContentPane().add(btnNegative);

		// Dot

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().contains(".")) {

					textField.setText(null);
					String EnterNumber = textField.getText() + "Error";
					textField.setText(EnterNumber);

				} else {
					String EnterNumber = textField.getText() + btnDot.getText();
					textField.setText(EnterNumber);

				}

			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(70, 356, 50, 50);
		frame.getContentPane().add(btnDot);

		// Operators

		// '+'

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// The following code makes sure the operator can only be used after a number
				// and then adds two numbers.

				if (textField.getText().isEmpty()) {

					textField.setText(null);
					String EnterNumber = textField.getText() + "Error";
					textField.setText(EnterNumber);

				} else {
					SetOperators();
					textField.setText("");
					operations = "+";

				}

			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(190, 295, 50, 50);
		frame.getContentPane().add(btnPlus);

		// '-'

		JButton btnMinus = new JButton("--");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().isEmpty()) {

					textField.setText(null);
					String EnterNumber = textField.getText() + "Error";
					textField.setText(EnterNumber);

				} else {
					SetOperators();
					textField.setText("");
					operations = "-";
				}

			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(190, 234, 50, 50);
		frame.getContentPane().add(btnMinus);

		// '*'

		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().isEmpty()) {

					textField.setText(null);
					String EnterNumber = textField.getText() + "Error";
					textField.setText(EnterNumber);

				} else {
					SetOperators();
					textField.setText("");
					operations = "*";

				}
			}
		});
		btnMultiplication.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiplication.setBounds(190, 173, 50, 50);
		frame.getContentPane().add(btnMultiplication);

		// '/'

		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().isEmpty()) {

					textField.setText(null);
					String EnterNumber = textField.getText() + "Error";
					textField.setText(EnterNumber);

				} else {
					SetOperators();
					textField.setText("");
					operations = "/";
				}
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivision.setBounds(249, 234, 50, 50);
		frame.getContentPane().add(btnDivision);

		// Times 10 to the power of

		JButton btn10TimesPowerOf = new JButton("x10^_");
		btn10TimesPowerOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().isEmpty()) {

					textField.setText(null);
					String EnterNumber = textField.getText() + "Error";
					textField.setText(EnterNumber);

				} else {

					SetOperators();
					textField.setText("");
					operations = "x10^_";
				}
			}
		});
		btn10TimesPowerOf.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn10TimesPowerOf.setBounds(190, 356, 110, 50);
		frame.getContentPane().add(btn10TimesPowerOf);

		// Equal

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().isEmpty()) {

					textField.setText(null);
					String EnterNumber = textField.getText() + "Error";
					textField.setText(EnterNumber);

				} else {

					SetOperators();

					// The following code checks for decimals and prints answers based on whether
					// they exist or not.

					if (firstnumber % 1 == 0) {

						textField.setText(String.format("%.0f", firstnumber));
						operations = "";

					} else {

						textField.setText(String.format("%.5f", firstnumber));
						operations = "";
					}

				}

			}
		});

		// Remainder

		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(249, 295, 50, 50);
		frame.getContentPane().add(btnEqual);

		JButton btnRemainder = new JButton("%");
		btnRemainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().isEmpty()) {

					textField.setText(null);
					String EnterNumber = textField.getText() + "Error";
					textField.setText(EnterNumber);

				} else {
					SetOperators();
					textField.setText("");
					operations = "%";
				}
			}
		});
		btnRemainder.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRemainder.setBounds(249, 174, 50, 50);
		frame.getContentPane().add(btnRemainder);

		// Clear

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText(null);
				firstnumber = null;
				secondnumber = null;
				operations = "";
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(228, 61, 87, 50);
		frame.getContentPane().add(btnClear);

		// Delete

		JButton btnDelete = new JButton("DEL");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String backspace = null;

				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(140, 61, 81, 50);
		frame.getContentPane().add(btnDelete);

		// Power of _

		JButton btnChoiceSquare = new JButton("^_");
		btnChoiceSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().isEmpty()) {

					textField.setText(null);
					String EnterNumber = textField.getText() + "Error";
					textField.setText(EnterNumber);

				} else {
					SetOperators();
					textField.setText("");
					operations = "^_";
				}
			}
		});
		btnChoiceSquare.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnChoiceSquare.setBounds(10, 123, 73, 39);
		frame.getContentPane().add(btnChoiceSquare);

		// Choice Root

		JButton btnChoiceRoot = new JButton("nthRoot");
		btnChoiceRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().isEmpty()) {

					textField.setText(null);
					String EnterNumber = textField.getText() + "Error";
					textField.setText(EnterNumber);

				} else {
					SetOperators();
					textField.setText("");
					operations = "nthRoot";
				}

			}
		});
		btnChoiceRoot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnChoiceRoot.setBounds(97, 122, 124, 39);
		frame.getContentPane().add(btnChoiceRoot);

	}

	// Compute --> Calculates the results of numbers based on the operators

	private String Compute() {

		/*
		 * These 3 print statements are used to check how the program works in each
		 * step.
		 * 
		 * 
		 * System.out.println("Compute First " + firstnumber);
		 * System.out.println("Compute Second " + secondnumber);
		 * System.out.println("Operator " + operations);
		 * 
		 * 
		 */
		if (firstnumber == null || secondnumber == null || operations == "") {
			return "";
		}

		double result = 0;
		switch (operations) {

		case "+":
			result = firstnumber + secondnumber;

			break;

		case "-":
			result = firstnumber - secondnumber;

			break;

		case "*":
			result = firstnumber * secondnumber;

			break;

		case "/":
			result = firstnumber / secondnumber;

			break;

		case "%":
			result = firstnumber % secondnumber;

			break;

		case "^_":
			result = Math.pow(firstnumber, secondnumber);

			break;

		case "x10^_":
			result = firstnumber * (Math.pow(10, secondnumber));

			break;

		case "nthRoot":
			result = Math.pow(firstnumber, (1 / secondnumber));

			break;

		}

		firstnumber = result;
		secondnumber = null;
		// Same things as above --> System.out.println("Compute Result " + result);
		return String.format("%.2f", result);

	}

	/*
	 * SetOperator --> This is made to make create a new first number, create a new
	 * second number and/or compute the two based on the current operator.
	 */

	private void SetOperators() {

		String textnumber = textField.getText();
		if (textnumber == "") {
			return;
		}

		double number = Double.parseDouble(textnumber);

		if (firstnumber == null) {
			firstnumber = number;
		} else {
			secondnumber = number;
			Compute();
		}

		// System.out.println("Set First " + firstnumber);
		// System.out.println("Set Second " + secondnumber);

	}
}
