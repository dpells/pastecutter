<<<<<<< HEAD
package pastecutter;

import java.awt.event.*;
import javax.swing.*;

public class HolderArray extends JPanel{
=======
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HolderArray extends JPanel implements ActionListener{
>>>>>>> 84cbd03c8a939f039a42b0339dc3407d5f81381a

	//butt list
	JButton[] buttons;
	//Current index to insert to.
	int currentIndex;

	//Amount of buttons on the UI.
	private static int buttCount = 5;

	public HolderArray(ActionListener parent){
		buttons = new JButton[buttCount];
		currentIndex = 0;
		setLayout(new GridLayout(buttCount, 1));
		for(int i = 0; i < buttCount; ++i){
			buttons[i] = new JButton();
<<<<<<< HEAD
			buttons[i] = setActionCommand("" + i);
		}
	}

	/**
	 *	:)
	 */
	public void insert(String s){
		buttons[currentIndex].setText(s);
		++currentIndex;
		currentIndex = (currentIndex >= buttCount) ? buttCount-1: currentIndex;
	}

	public String get(int i){
		if(i > 0){
			.
		}else{
			return buttons[0].getText();
		}
=======
			buttons[i].addActionListener(parent);
			buttons[i].addActionListener(this);
			buttons[i] = setActionCommand("");	
		}
		setPreferredWidth(100);
	}

	/**
	 *	Inserts a string at the top of the array and cascades the rest down.
	 */
	public void insert(String s){
		for(int i = buttCount-1; i >= 0; --i){
			buttons[i].setText(buttons[i-1].getText());
			buttons[i].setActionCommand(buttons[i].getText());
		}
		buttons[0].setText(s);
		buttons[0].setActionCommand(s);
	}

	/**
	 *	Rearranges the buttons accordingly.
	 */
	public void actionPerformed(ActionEvent e){
		Object src = ActionEvent.getSource();
		int callingIndex = -1; String topText = "";
		for(int i = 0; i < buttCount; ++i){
			if(src.equals(buttons[i])){ callingIndex = i; topText = buttons[i].getText(); }
		}
		if(callingIndex <= 0) return;
		for(int j = callingIndex; j > 0; --j){
			buttons[j].setText() = buttons[j-1].getText();
			buttons[j].setActionCommand(buttons[j-1].getText();
		}
		buttons[0].setText(topText);
		buttons[0].setActionCommand(topText);
>>>>>>> 84cbd03c8a939f039a42b0339dc3407d5f81381a
	}
}
