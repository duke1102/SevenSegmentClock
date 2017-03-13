package com.segment.lib;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class UI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4621924450652779205L;
	private Segment[] segment = new Segment[8];
	
	public UI()
	{
		this.setName("UI_Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(Constants.ICO_URL).getImage());
		setTitle(Constants.APP_TITLE);
		setSize(880, 320);
		setLocation(800, 600);
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		FlowLayout layout = new FlowLayout();
		layout.setHgap(8);
		layout.setVgap(0);
		layout.setAlignment(FlowLayout.LEFT);
		setLayout(layout);
		setAlwaysOnTop(true);
		Dimension dim = new Dimension();
		
		for (int i = 0; i < 6; i++)
		{
			dim.setSize(getSize().width/6.5f, 300);
			segment[i] = new Segment(dim, Color.LIGHT_GRAY);
			segment[i].setName("Segment #"+i);
			segment[i].setPreferredSize(dim);
			segment[i].setLayout(null);
			
			for (int j = 0; j < 7; j++)
			{
				segment[i].getPanelSeg(j).setBackground((i < 2) ? Color.RED : (i < 4) ? Color.CYAN : (i < 6) ? Color.GREEN : Color.WHITE);
				segment[i].getPanelSeg(j).setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
				segment[i].add(segment[i].getPanelSeg(j));
			}
			getContentPane().add(segment[i]);
		}

	}
	

	public void updateHour(int hour) // 0 & 1
	{
		for (int i = 0; i < 7; i++)
		{
				segment[0].getPanelSeg(i).setVisible((Constants.CLOCKBIN[Constants.getNthDigit(hour, 10, 2)][i] == true) ? true : false);
				segment[1].getPanelSeg(i).setVisible((Constants.CLOCKBIN[Constants.getNthDigit(hour, 10, 1)][i] == true) ? true : false);
		}
	}
	
	public void updateMinute(int minute) // 2 & 3
	{
		for (int i = 0; i < 7; i++)
		{
				segment[2].getPanelSeg(i).setVisible((Constants.CLOCKBIN[Constants.getNthDigit(minute, 10, 2)][i] == true) ? true : false);
				segment[3].getPanelSeg(i).setVisible((Constants.CLOCKBIN[Constants.getNthDigit(minute, 10, 1)][i] == true) ? true : false);
		}
	}
	
	public void updateSecond(int second) // 4 & 5
	{		
		for (int i = 0; i < 7; i++)
		{
				segment[4].getPanelSeg(i).setVisible((Constants.CLOCKBIN[Constants.getNthDigit(second, 10, 2)][i] == true) ? true : false);
				segment[5].getPanelSeg(i).setVisible((Constants.CLOCKBIN[Constants.getNthDigit(second, 10, 1)][i] == true) ? true : false);
		}
	}

}
