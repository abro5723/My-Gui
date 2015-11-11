package gui.view;

import javax.swing.JFrame;
import gui.controller.MyGuiController;

public class MyGuiFrame extends JFrame
{
	private MyGuiController baseController;
	private MyGuiPanel basePanel;
	
	public MyGuiFrame(MyGuiController baseController)
	{
		this.baseController = baseController;
		basePanel = new MyGuiPanel(baseController);
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setTitle("Simple Gui!!");
		this.setResizable(false);
		this.setVisible(true);
	}

	public MyGuiController getBaseController()
	{
		return baseController;
	}

}
