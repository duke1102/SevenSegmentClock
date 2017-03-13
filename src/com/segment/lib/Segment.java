package com.segment.lib;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Segment extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4980210296562972446L;
	
	private Rectangle[] rect = {
			new Rectangle(10,10,115,10),
			new Rectangle(125,20,10,115),
			new Rectangle(125,145,10,115),
			new Rectangle(10,260,115,10),
			new Rectangle(0,145,10,115),
			new Rectangle(0,20,10,115),
			new Rectangle(10,135,115,10)
		};
	
	private JPanel[] pnlSeg;
	
	public JPanel getPanelSeg(int index)
	{
		return this.pnlSeg[index];
	}
	
	public Segment() {
		super();
		initSegment(new Dimension(80,80), Color.DARK_GRAY);
		
	}

	public Segment(Dimension dim, Color col) {
		super();
		initSegment(dim, col);
	}

	private void initSegment(Dimension dim, Color col)
	{
		this.setName("HauptSegment");
		this.setBackground(Color.DARK_GRAY);
		this.setSize(dim);
		this.pnlSeg = new JPanel[7];
		
		for (int j = 0; j < 7; j++)
		{
			this.pnlSeg[j] = new JPanel();
			this.pnlSeg[j].setName("SegmentTeil #"+j);
			this.pnlSeg[j].setToolTipText(this.pnlSeg[j].getName());
			this.pnlSeg[j].setBounds(rect[j]);
			this.pnlSeg[j].setLayout(null);
		}
		
	}

	public Rectangle getRect(int index)
	{
		return rect[index];
	}
}
