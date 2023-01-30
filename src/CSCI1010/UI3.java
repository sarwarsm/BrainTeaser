package CSCI1010;

//import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Arrays;
//import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;  

@SuppressWarnings("serial")
public class UI3 extends JFrame implements ActionListener{

	private final String pattern1 = "xxx";
	private final String pattern2 = "ooo";
	
	private String array[][] = new String[3][3];
    private JFrame f;  
    private JTextField text; 
    private JTextField textCell00; 
    private JTextField textCell01; 
    private JTextField textCell02; 
    private JTextField textCell10; 
    private JTextField textCell11; 
    private JTextField textCell12; 
    private JTextField textCell20; 
    private JTextField textCell21; 
    private JTextField textCell22; 

    private JButton btnAccept;
    private JButton btnReset;
    private JButton btnExit;
    private JButton btnBOT;
	
    public UI3() {
    	setup();
    }
    
    public void setup() {
		// TODO Auto-generated constructor stub
    	f = new JFrame("Tic-Tac-Toe V1.0");
    	text = new JTextField("");
	    text.setBounds(50,60, 300,50); 
	  
	    textCell00 = new JTextField("");
	    textCell01 = new JTextField("");
	    textCell02 = new JTextField("");
	    textCell10 = new JTextField("");
	    textCell11 = new JTextField("");
	    textCell12 = new JTextField("");
	    textCell20 = new JTextField("");
	    textCell21 = new JTextField("");
	    textCell22 = new JTextField("");

	    textCell00.setBounds(125,150,50,50);
	    textCell01.setBounds(175,150,50,50);
	    textCell02.setBounds(225,150,50,50);
	    textCell10.setBounds(125,200,50,50);
	    textCell11.setBounds(175,200,50,50);
	    textCell12.setBounds(225,200,50,50);
	    textCell20.setBounds(125,250,50,50);
	    textCell21.setBounds(175,250,50,50);
	    textCell22.setBounds(225,250,50,50);

	    btnAccept = new JButton("Accept");
	    btnReset = new JButton("Reset");
	    btnExit = new JButton("Exit");
	    btnBOT = new JButton("BOT");
		
	    btnAccept.setBounds(50, 350, 100, 50);
	    btnReset.setBounds(150, 350, 100, 50);
	    btnExit.setBounds(250, 350, 100, 50);
	    btnBOT.setBounds(50, 400, 300, 50);
	   
	    btnAccept.addActionListener(this);
	    btnReset.addActionListener(this);
	    btnExit.addActionListener(this);
	    btnBOT.addActionListener(this);

	    f.add(text); 
	    
	    f.add(textCell00);
	    f.add(textCell01);
	    f.add(textCell02);
	    f.add(textCell10);
	    f.add(textCell11);
	    f.add(textCell12);
	    f.add(textCell20);
	    f.add(textCell21);
	    f.add(textCell22);

	    f.add(btnAccept);
	    f.add(btnReset);
	    f.add(btnExit);
	    f.add(btnBOT);

	    f.setSize(400,550);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	    
	    this.reset();
    }

	/**
	 * @return the text
	 */
	public JTextField getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(JTextField text) {
		this.text = text;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//String ac = e.getActionCommand();
		if(e.getSource().equals(this.btnAccept)) {
			array[0][0] = this.textCell00.getText().toString();
			array[0][1] = this.textCell01.getText().toString();
			array[0][2] = this.textCell02.getText().toString();
			array[1][0] = this.textCell10.getText().toString();
			array[1][1] = this.textCell11.getText().toString();
			array[1][2] = this.textCell12.getText().toString();
			array[2][0] = this.textCell20.getText().toString();
			array[2][1] = this.textCell21.getText().toString();
			array[2][2] = this.textCell22.getText().toString();
			
			boolean match[] = matchPattern();
			if(match[0])
				this.text.setText("Player X is the winner");
			else if(match[1])
				this.text.setText("Player O is the winner");
			else
				this.text.setText("Keep playing");
		}else if(e.getSource().equals(this.btnReset)) {
			this.reset();
			this.text.setText("Reset completed. Keep playing");
		}else if(e.getSource().equals(this.btnExit)) {
			System.exit(NORMAL);
		}else if(e.getSource().equals(this.btnBOT)) {
			this.callBot();
		}		
		
	}  

	private boolean[] matchPattern() {
		boolean result[] = {false, false};
		boolean done = false;
		
		if(!done) {
			//for diagonal 1
			String pattern = array[0][0] + array[1][1] + array[2][2];
			
			if(pattern.toLowerCase().equals(pattern1)) {
				result[0] = true;
				done = true;
			}else if(pattern.toLowerCase().equals(pattern2)) {
				result[1] = true;
				done = true;;
			}
		}

		if(!done) {
			//for diagonal 1
			String pattern = array[0][2] + array[1][1] + array[2][0];
			if(pattern.toLowerCase().equals(pattern1)) {
				result[0] = true;
				done = true;
			}else if(pattern.equals(pattern2)) {
				result[1] = true;
				done = true;;
			}
			
		}
		
		//All rows
		for(int i=0; !done && i < 3;i++) {
			String pattern = "";
			for(int j=0; !done && j<3; j++) {
				pattern += array[i][j];
			}
			if(pattern.toLowerCase().equals(pattern1)) {
				result[0] = true;
				done = true;
			}else if(pattern.toLowerCase().equals(pattern2)) {
				result[1] = true;
				done = true;;
			}
		}
		
		//All columns
		for(int j=0; !done && j < 3;j++) {
			String pattern = "";
			for(int i=0; !done && i<3; i++) {
				pattern += array[i][j];
			}
			if(pattern.toLowerCase().equals(pattern1)) {
				result[0] = true;
				done = true;
			}else if(pattern.toLowerCase().equals(pattern2)) {
				result[1] = true;
				done = true;;
			}
		}

		
		return result;
	}

	
	private void reset() {
		for(int i=0; i<3; i++)
			for(int j=0;j<3;j++)
				array[i][j] = "";
		
		this.textCell00.setText("");
		this.textCell01.setText("");
		this.textCell02.setText("");
		this.textCell10.setText("");
		this.textCell11.setText("");
		this.textCell12.setText("");
		this.textCell20.setText("");
		this.textCell21.setText("");
		this.textCell22.setText("");
	}
	private boolean arrayfull() {
		boolean result = false;
		int count = 0;
		for(int i=0; i<3; i++)
			for(int j=0;j<3;j++)
				if(array[i][j].toLowerCase().equals("x") || 
						array[i][j].toLowerCase().equals("o")) {
					count++;
				}
		if(count >= 9)
			result = true;
		else
			result = false;
		
		return result;	
	}
	
	private void processUserInput() {
		array[0][0] = this.textCell00.getText().toString();
		array[0][1] = this.textCell01.getText().toString();
		array[0][2] = this.textCell02.getText().toString();
		array[1][0] = this.textCell10.getText().toString();
		array[1][1] = this.textCell11.getText().toString();
		array[1][2] = this.textCell12.getText().toString();
		array[2][0] = this.textCell20.getText().toString();
		array[2][1] = this.textCell21.getText().toString();
		array[2][2] = this.textCell22.getText().toString();
	}

	private void callBot() {
		int row;
		int col;
		boolean done = false;
		
		if(arrayfull())
			return;
		
		processUserInput();
		while(!done) {
			row = (int)(Math.random()*3);
			col = (int)(Math.random()*3);
			if(!array[row][col].toLowerCase().equals("x") && !array[row][col].toLowerCase().equals("o")) {
				array[row][col] = "o";
				if(row == 0 && col == 0)
					this.textCell00.setText("o");
				else if(row == 0 && col == 1)
					this.textCell01.setText("o");
				else if(row == 0 && col == 2)
					this.textCell02.setText("o");
				else if(row == 1 && col == 0)
					this.textCell10.setText("o");
				else if(row == 1 && col == 1)
					this.textCell11.setText("o");
				else if(row == 1 && col == 2)
					this.textCell12.setText("o");
				else if(row == 2 && col == 0)
					this.textCell20.setText("o");
				else if(row == 2 && col == 1)
					this.textCell21.setText("o");
				else if(row == 2 && col == 2)
					this.textCell22.setText("o");
				done = true;
			}
		}
	}
	
}
