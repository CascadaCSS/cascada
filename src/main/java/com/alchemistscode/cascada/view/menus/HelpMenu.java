package com.alchemistscode.cascada.view.menus;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import org.springframework.stereotype.Component;

@Component
public class HelpMenu extends JMenu{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7201831677612625429L;
	
	private JMenuItem aboutItem = new JMenuItem("About");
	
	public HelpMenu() {
		this.setText("Help");
		this.add(aboutItem);
	}
}
