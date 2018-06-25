package com.alchemistscode.cascada.view.panels;

import java.awt.Dimension;

import javax.annotation.PostConstruct;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alchemistscode.cascada.helpers.ScreenHelper;
import com.alchemistscode.cascada.view.WindowsContainer;
import com.alchemistscode.cascada.view.menus.FileMenu;
import com.alchemistscode.cascada.view.menus.HelpMenu;

@Component
public class PrincipalPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1415766294776144065L;

	private JMenuBar menuBar = new JMenuBar();
	
	@Autowired
	private ScreenHelper screenHelper;
	
	@Autowired
	private WindowsContainer internalDesktop;
	
	@Autowired
	private FileMenu fileMenu;
	
	@Autowired
	private HelpMenu helpMenu;
	
	@PostConstruct
	public void init() {

		menuBar.setBounds(0, 0, screenHelper.getScreenWidth(), 30);
		internalDesktop.setBounds(0, 30, screenHelper.getScreenWidth(), screenHelper.getScreenHeight() - 30);

		add(menuBar);
		add(internalDesktop);
		
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);


		setLayout(null);
		setPreferredSize(new Dimension(screenHelper.getScreenWidth(), screenHelper.getScreenHeight() - 100));
	}

}
