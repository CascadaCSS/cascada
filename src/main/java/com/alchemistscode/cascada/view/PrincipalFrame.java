package com.alchemistscode.cascada.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;

import com.alchemistscode.cascada.helpers.FileHelper;
import com.alchemistscode.cascada.view.panels.PrincipalPanel;

public class PrincipalFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -599711091543331555L;

	@Autowired
	private PrincipalPanel principalPanel;

	@Autowired
	private FileHelper fileHelper;
	
	public void init() {
		add(principalPanel);
		setResizable(false);
		ImageIcon icon=new ImageIcon(fileHelper.loadResource("images/cascada.png"));
		setIconImage(icon.getImage());
		pack();
	}

}
