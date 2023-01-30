package CSCI1010;

//import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;  

@SuppressWarnings("serial")
public class UI extends JFrame implements ActionListener{

    private JFrame f;  
    private JTextField text; 
    private JButton btnA = new JButton("A");
    private JButton btnB = new JButton("B");
    private JButton btnC = new JButton("C");
    private JButton btnD = new JButton("D");
    private JButton btnE = new JButton("E");
    private JButton btnF = new JButton("F");
    private JButton btnG = new JButton("G");
    private JButton btnH = new JButton("H");
    private JButton btnI = new JButton("I");
    private JButton btnJ = new JButton("J");
    private JButton btnK = new JButton("K");
    private JButton btnL = new JButton("L");
    private JButton btnM = new JButton("M");
    private JButton btnN = new JButton("N");
    private JButton btnO = new JButton("O");
    private JButton btnP = new JButton("P");
    private JButton btnQ = new JButton("Q");
    private JButton btnR = new JButton("R");
    private JButton btnS = new JButton("S");
    private JButton btnT = new JButton("T");
    private JButton btnU = new JButton("U");
    private JButton btnV = new JButton("V");
    private JButton btnW = new JButton("W");
    private JButton btnX = new JButton("X");
    private JButton btnY = new JButton("Y");
    private JButton btnZ = new JButton("Z");
    private JButton btnAccept = new JButton("Accept");
    private JButton btnReject = new JButton("Reject");
    private JButton btnReset = new JButton("Reset");
    private JButton btnExit = new JButton("Exit");
	
    public UI() {
    	setup();
    }
    
    public void setup() {
		// TODO Auto-generated constructor stub
    	f = new JFrame("Brain");
    	text = new JTextField("");
	    text.setBounds(50,60, 550,50);  
	    
	    btnA.setBounds(50, 150, 100, 50);
	    btnB.setBounds(160, 150, 100, 50);
	    btnC.setBounds(270, 150, 100, 50);
	    btnD.setBounds(380, 150, 100, 50);
	    btnE.setBounds(490, 150, 100, 50);
	    
	    btnF.setBounds(50, 210, 100, 50);
	    btnG.setBounds(160, 210, 100, 50);
	    btnH.setBounds(270, 210, 100, 50);
	    btnI.setBounds(380, 210, 100, 50);
	    btnJ.setBounds(490, 210, 100, 50);
	    
	    btnK.setBounds(50, 270, 100, 50);
	    btnL.setBounds(160, 270, 100, 50);
	    btnM.setBounds(270, 270, 100, 50);
	    btnN.setBounds(380, 270, 100, 50);
	    btnO.setBounds(490, 270, 100, 50);
	    
	    btnP.setBounds(50, 330, 100, 50);
	    btnQ.setBounds(160, 330, 100, 50);
	    btnR.setBounds(270, 330, 100, 50);
	    btnS.setBounds(380, 330, 100, 50);
	    btnT.setBounds(490, 330, 100, 50);
	    
	    btnU.setBounds(50, 390, 100, 50);
	    btnV.setBounds(160, 390, 100, 50);
	    btnW.setBounds(270, 390, 100, 50);
	    btnX.setBounds(380, 390, 100, 50);
	    btnY.setBounds(490, 390, 100, 50);
	    
	    btnZ.setBounds(50, 450, 100, 50);
	    btnAccept.setBounds(160, 450, 100, 50);
	    btnReject.setBounds(270, 450, 100, 50);
	    btnReset.setBounds(380, 450, 100, 50);
	    btnExit.setBounds(490, 450, 100, 50);
	    
	    f.add(text); 
	    
	    f.add(btnA);
	    f.add(btnB);
	    f.add(btnC);
	    f.add(btnD);
	    f.add(btnE);
	    
	    f.add(btnF);
	    f.add(btnG);
	    f.add(btnH);
	    f.add(btnI);
	    f.add(btnJ);

	    f.add(btnK);
	    f.add(btnL);
	    f.add(btnM);
	    f.add(btnN);
	    f.add(btnO);

	    f.add(btnP);
	    f.add(btnQ);
	    f.add(btnR);
	    f.add(btnS);
	    f.add(btnT);

	    f.add(btnU);
	    f.add(btnV);
	    f.add(btnW);
	    f.add(btnX);
	    f.add(btnY);

	    f.add(btnZ);
	    f.add(btnAccept);
	    f.add(btnReject);
	    f.add(btnReset);
	    f.add(btnExit);

	    f.setSize(680,630);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	    
	    btnA.addActionListener(this);
	    
	}

	/**
	 * @return the f
	 */
	public JFrame getF() {
		return f;
	}

	/**
	 * @param f the f to set
	 */
	public void setF(JFrame f) {
		this.f = f;
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

	public static void mymain(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//UI driver = new UI();
		//BrainTeaser brain = 
		new BrainTeaser();
		
	/**
		while(true) {
			Thread.sleep(5000);
			clock.setDate(new Date());
			driver.getText().setText(clock.getDate().toString());
			clock.showDate();
		}
		*/
	}
	
	public void display(Date date)  
    {  
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		//String ac = e.getActionCommand();
		if(e.getSource().equals(this.btnA))
			System.out.println("A");
/**		
		if(opCount == 0) {
			tDisplay.setText("");
		}

		tDisplay.append(ac);
		
		if(ac.equals("=")) {
			opCount = 0;
			if(operator == 1) {
				//addition operation
				result = op1 + op2;
				tDisplay.append(Integer.toString(result));
			}
			else if(operator == 2) {
				//write codes for subtraction  
				result = op1 - op2;
				tDisplay.append(Integer.toString(result));
			}
			else if(operator == 3) {
				//write codes for division  
				result = op1 / op2;
				tDisplay.append(Integer.toString(result));
			}
			else if(operator == 4) {
				//write codes for multiplication  
				result = op1 * op2;
				tDisplay.append(Integer.toString(result));
			}
			// Add "else if" code blocks to include support for subtraction (operator = 2), 
			// division (operator = 3), and multiplication (operator = 4) 

		}
		else if(ac.equals("+")) {
			operator = 1;
		}
		else if(ac.equals("-")) {
			operator = 2;
		}
		else if(ac.equals("/")) {
			operator = 3;
		}
		else if(ac.equals("*")) {
			operator = 4;
		}
		// Add "else if" code blocks to include support for subtraction (operator = 2), 
		// division (operator = 3), and multiplication (operator = 4) 
		else {
			int value = Integer.valueOf(ac);
			if(opCount < 1) {
				op1 = value;
				opCount = 1;
			}
			else if(opCount >= 1) {
				op2 = value;
				opCount = 2;
			}
		}
	}
	*/
	}  
	

}
