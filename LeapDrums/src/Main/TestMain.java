package Main;

import java.awt.EventQueue;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.UIManager;

import audio.*;
import ui.*;

public class TestMain {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		AudioManager.loadConfig();
		
		Object[] instrNames = AudioManager.getInstrumentNames().toArray(); 
		MainUI ui = new MainUI(Arrays.copyOf(instrNames, instrNames.length, String[].class));
	}

}
