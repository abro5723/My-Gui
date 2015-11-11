package gui.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.color.*;

import javax.swing.JPanel;

import gui.controller.MyGuiController;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MyGuiPanel extends JPanel
{
	private MyGuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public MyGuiPanel(MyGuiController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Don't push me");
		firstTextField = new JTextField("Words should be typed here.");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.add(firstButton);
		this.add(firstTextField);
		this.setLayout(baseLayout);
		this.setBackground(Color.RED);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("wow, you pressed yu first button. good job.");
			}
			
		});
	}

}
