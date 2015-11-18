/**
 * 
 */
package gui.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import gui.controller.*;
import gui.view.*;

/**
 * @author CodyH
 * @version 0.x Nov 12, 2015
 *
 */
public class GUIFrameTest
{

	private MyGuiFrame testFrame;
	private MyGuiPanel testPanel;
	private MyGuiController testController;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		testController = new MyGuiController();
		testFrame = new MyGuiFrame(testController);
		testPanel = new MyGuiPanel(testController);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
		testFrame = null;
		testPanel = null;
		testController = null;
	}

	/**
	 * Test method for {@link gui.view.GUIFrame#GUIFrame(gui.controller.GUIAppController)}.
	 */
	@Test
	public void testGUIFrame()
	{
		assertTrue(testFrame.getContentPane() instanceof MyGuiPanel);
		assertTrue(testFrame.isVisible());
		assertTrue(testFrame.getWidth() > 100);
		assertTrue(testFrame.getHeight() > 100);
	}
	

	/**
	 * Test method for {@link gui.view.GUIFrame#getBaseController()}.
	 */
	@Test
	public void testGetBaseController()
	{
		assertNotNull(testFrame.getBaseController());
		assertTrue(testFrame.getBaseController() instanceof MyGuiController);
	}

}
