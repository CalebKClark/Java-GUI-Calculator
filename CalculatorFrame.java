package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
	
	JTextField display;
	JPanel buttonPanel;
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button0;
	JButton buttonDecimal;
	JButton buttonNegative;
	JButton plusButton;
	JButton minusButton;
	JButton multiplyButton;
	JButton divideButton;
	JButton enterButton;
	JButton resetButton;
	JButton blank;
	JButton blank2;
	
	double argument1;
	double argument2;
	
	boolean argument1Settled = false;
	boolean argument1Exists = false;
	
	String operator = "";
	
	public CalculatorFrame() {
		createDisplay();
		createButtons();
		addListeners();
		setVisible(true);
	}
	
	// Core calculator logic
	
	public String add(double arg1, double arg2) {
		double result = arg1 + arg2;
		
		return String.format("%.5f", result);
	}
	
	public String subtract(double arg1, double arg2) {
		double result = arg1 - arg2;
		
		return String.format("%.5f", result);
	}
	
	public String multiply(double arg1, double arg2) {
		double result = arg1 * arg2;
		
		return String.format("%.5f", result);
	}
	
	public String divide(double arg1, double arg2) {
		if (arg2 == 0.0) {
			return "Undefined";
		}
		double result = arg1 / arg2;
		
		return String.format("%.5f", result);
	}
	
	// GUI Setup
	
	public void createDisplay() {
		setTitle("Calculator");
		setSize(800, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setLayout(new BorderLayout());
		
		display = new JTextField();
		display.setPreferredSize(new Dimension(800, 160));
		display.setFont(new Font("Arial", Font.BOLD, 70));
		display.setHorizontalAlignment(JTextField.RIGHT);
		add(display, BorderLayout.NORTH);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,4,5,5));
		buttonPanel.setBackground(Color.BLACK);
		getContentPane().setBackground(Color.BLACK);
	}
	
	public void createButtons() {
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button0 = new JButton("0");
		buttonDecimal = new JButton(".");
		buttonNegative = new JButton("(-)");
		plusButton = new JButton("+");
		minusButton = new JButton("-");
		multiplyButton = new JButton("X");
		divideButton = new JButton("÷");
		enterButton = new JButton("ENTER");
		resetButton = new JButton("RESET");
		blank = new JButton();
		blank2 = new JButton();
		
		customizeButton(button1);
		customizeButton(button2);
		customizeButton(button3);
		customizeButton(button4);
		customizeButton(button5);
		customizeButton(button6);
		customizeButton(button7);
		customizeButton(button8);
		customizeButton(button9);
		customizeButton(button0);
		customizeButton(buttonDecimal);
		customizeButton(buttonNegative);
		customizeButton(blank);
		customizeButton(blank2);
		customizeOperatorButton(plusButton);
		customizeOperatorButton(minusButton);
		customizeOperatorButton(multiplyButton);
		customizeOperatorButton(divideButton);
		customizeMiscButton(enterButton);
		customizeMiscButton(resetButton);
		
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		buttonPanel.add(divideButton);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(multiplyButton);
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(minusButton);
		buttonPanel.add(buttonNegative);
		buttonPanel.add(button0);
		buttonPanel.add(buttonDecimal);
		buttonPanel.add(plusButton);
		buttonPanel.add(resetButton);
		buttonPanel.add(blank);
		buttonPanel.add(blank2);
		buttonPanel.add(enterButton);
		
		add(buttonPanel, BorderLayout.CENTER);
	}
	
	public void addListeners() {
		button1.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			argument1Exists = true;
            display.setText(display.getText() + "1");
        });
		
		button2.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			argument1Exists = true;
            display.setText(display.getText() + "2");       
        });
		
		button3.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			argument1Exists = true;
            display.setText(display.getText() + "3");

        });
		
		button4.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			argument1Exists = true;
		    display.setText(display.getText() + "4");

		});

		button5.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			argument1Exists = true;
		    display.setText(display.getText() + "5");

		});

		button6.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			argument1Exists = true;
		    display.setText(display.getText() + "6");

		});

		button7.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			argument1Exists = true;
		    display.setText(display.getText() + "7");

		});

		button8.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			argument1Exists = true;
		    display.setText(display.getText() + "8");

		});

		button9.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			argument1Exists = true;
		    display.setText(display.getText() + "9");

		});

		button0.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			argument1Exists = true;
		    display.setText(display.getText() + "0");

		});
		
		buttonDecimal.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
		    display.setText(display.getText() + ".");

		});
		
		buttonNegative.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			argument1Exists = true;
			double cur = Double.parseDouble(display.getText());
		    display.setText(String.valueOf(cur * -1));

		});
		
		plusButton.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			if (argument1Exists) {
				argument1 = Double.parseDouble(display.getText());
			    argument1Settled = true;
			    operator = "+";
			    display.setText("");
			}
		});
		
		minusButton.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			if (argument1Exists) {
				argument1 = Double.parseDouble(display.getText());
			    argument1Settled = true;
			    operator = "-";
			    display.setText("");
			}
		});
		
		multiplyButton.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			if (argument1Exists) {
				argument1 = Double.parseDouble(display.getText());
			    argument1Settled = true;
			    operator = "X";
			    display.setText("");
			}
		});
		
		divideButton.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			if (argument1Exists) {
				argument1 = Double.parseDouble(display.getText());
			    argument1Settled = true;
			    operator = "÷";
			    display.setText("");
			}
		});
		
		enterButton.addActionListener(e -> {
			if (display.getText().equals("Undefined")) {
				display.setText("");
			}
			if (argument1Settled) {
				argument2 = Double.parseDouble(display.getText());
			}
			
			if (argument1Exists) {
				
			}
			switch (operator) {
			case "+":
				display.setText(add(argument1, argument2));
				break;
			case "-":
				display.setText(subtract(argument1, argument2));
				break;
			case "X":
				display.setText(multiply(argument1, argument2));
				break;
			case "÷":
				display.setText(divide(argument1, argument2));
				break;
			}
			
			if (display.getText().equals("Undefined")) {
				argument1 = 0;
				argument1Exists = false;
			} else {
				argument1 = Double.parseDouble(display.getText());
			}
			argument1Settled = false;
		});
		
		resetButton.addActionListener(e -> {
			argument1Exists = false;
			display.setText("");
		    argument1Settled = false;
		    argument1 = 0;
		    argument2 = 0;
		    operator = "";
		});
	}
	
	public void customizeButton (JButton button) {
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.YELLOW);
		button.setFont(new Font("Arial", Font.BOLD, 50));
	}
	
	public void customizeOperatorButton (JButton button) {
		button.setBackground(Color.ORANGE);
		button.setForeground(Color.RED);
		button.setFont(new Font("Arial", Font.BOLD, 50));
	}
	
	public void customizeMiscButton (JButton button) {
		button.setBackground(Color.GREEN);
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Arial", Font.BOLD, 30));
	}
	
}
