package com.alchemistscode.cascada;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alchemistscode.cascada.view.PrincipalFrame;

public class Launcher {

	public static void main(String[] args) {
		String[] contextPaths = new String[] { "cascada.xml" };
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(contextPaths);
		PrincipalFrame windows=(PrincipalFrame) ctx.getBean("window");
		windows.init();
		ctx.close();
	}
}
