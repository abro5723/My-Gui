package gui.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.color.*;
import java.util.Random;

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
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 12, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 10, SpringLayout.WEST, this);
	}
	
	private void changeRandomColor()
	{
		int red, green, blue;
		red = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
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
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				changeRandomColor();
			}

			public void mousePressed(MouseEvent pressed)
			{
				
				
			}

			public void mouseReleased(MouseEvent released)
			{
				
				
			}

			public void mouseExited(MouseEvent exited)
			{
				changeRandomColor();
				
			}
		});
	}

}
