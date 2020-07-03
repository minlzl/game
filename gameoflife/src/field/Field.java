package field;

import java.util.ArrayList;

import cell.Cell;
public class Field {
	private int height;
	private int width;
	public Cell field[][];
	public Field(int h,int w)
	{
		this.height=h;
		this.width=w;
		this.field=new Cell [h][w];
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Cell place(int h,int w,Cell o)
	{
		Cell ret=field[h][w];
		field[h][w]=o;
		return ret;
	}
	public Cell get(int h,int w)
	{
		return this.field[h][w];
	}
	public Cell[] getneiber(int h,int w)
	{
		ArrayList<Cell> list=new ArrayList<Cell>();
		for(int i=-1;i<2;i++)
		{
			for(int j=-1;j<2;j++)
			{
				int r=h+i;
				int c=w+j;
				if(r >-1 && r<height && c>-1 && c<width && !(r== h && c == w))
				{
					list.add(field[r][c]);
				}
			}
		}
		return list.toArray(new Cell[list.size()]);
	}
	public void clear()
	{
		for(int i=0;i<this.height;i++)
		{
			for(int j=0;j<this.width;j++)
			{
				field[i][j]=null;
			}
		}
	}
}












