package com.segment.lib;

import java.util.Timer;
import java.util.TimerTask;

public class ClockUpdate {

	private UI ui;
	private Timer t;
	private ClockController cont;
	
	public ClockUpdate(UI _ui)
	{
		this.ui = _ui;
		this.cont = new ClockController();
		
		startTimer();
	}
	
	private void startTimer()
	{
		t = new Timer();
		
		t.schedule(new TimerTask() {
			
			@Override
			public void run()
			{
				ui.updateHour(cont.getHour());
				ui.updateMinute(cont.getMinute());
				ui.updateSecond(cont.getSecond());
			}
		}, 0, 1000);
	}
}
