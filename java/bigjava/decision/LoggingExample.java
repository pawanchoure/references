package com.pawanchoure.bigjava.decision;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		Logger.getGlobal().setLevel(Level.INFO);
		Logger.getGlobal().info("Pawan Choure");
		Logger.getGlobal().setLevel(Level.SEVERE);
		Logger.getGlobal().severe("Pawan Choure");

	}

}
