package com.segment.main;

import com.segment.lib.ClockUpdate;
import com.segment.lib.UI;

public class Application {

	public static void main(String[] args) {
		UI ui = new UI();
		ui.setVisible(true);		
		
		@SuppressWarnings("unused")
		ClockUpdate clockUpdate = new ClockUpdate(ui);

	}
}
