package com.alchemistscode.cascada.view;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

import org.springframework.stereotype.Component;

@Component
public class WindowsContainer extends JDesktopPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5578977844704006096L;
	
	public void addJInternalFrame(JInternalFrame component){
		if(!validateIfComponentIsAdded(component)){
			add(component);
		}
		else{
			component.setVisible(true);
		}
	}
	
	private boolean validateIfComponentIsAdded(JInternalFrame component) {
		boolean flag = false;
		for (JInternalFrame internal : getAllFrames()) {
			if (internal.equals(component)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void centerWindow(JInternalFrame component) {
		Point point=new Point();
		point.x=(getWidth()/2)-(component.getWidth()/2);
		point.y=(getHeight()/2)-(component.getHeight()/2);
		component.setLocation(point);
	}
	
	@Override
	  protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
