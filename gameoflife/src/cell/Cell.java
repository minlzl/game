package cell;

import java.awt.Color;
import java.awt.Graphics;

public class Cell {
	private boolean isalive=false;

	public void die()
	{
		this.isalive=false;
	}
	public void reborn()
	{
		this.isalive=true;
	}
	public boolean islive()
	{
		return this.isalive;
	}
	public void clear()
	{
		this.isalive=false;
	}
	public void draw(Graphics g,int x,int y,int size)
	{
		g.drawRect(x, y, size, size);
		g.setColor(Color.GREEN);
		if(this.isalive==true)
		{
			g.fillRect(x, y, size, size);
			
		}
	}
}
