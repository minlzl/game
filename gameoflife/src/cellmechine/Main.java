package cellmechine;

import javax.swing.JFrame;

import cell.Cell;
import field.Field;
import field.View;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Field field=new Field(50, 50);
		for(int i=0;i<field.getHeight();i++)
		{
			for(int j=0;j<field.getWidth();j++)
			{
				field.place(i, j, new Cell());
				Cell cell=field.get(i, j);
				if (Math.random()<0.2)
				{
					cell.reborn();
				}
			}
		}
		View view=new View(field);
		JFrame jframe=new JFrame();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setResizable(false);
		jframe.setTitle("GameOfCell");
		jframe.add(view);
		jframe.pack();
		jframe.setVisible(true);
		while(true)
		{
			for(int i=0;i<field.getHeight();i++)
			{
				for(int j=0;j<field.getWidth();j++)
				{
					Cell cell=field.get(i, j);
					int ner=0;
					Cell [] c=field.getneiber(i, j);
					for(int x=0;x<c.length;x++)
					{
						if(c[x].islive()==true)
						{
							ner++;
						}
					}
//					if(ner==3)
//					{
//						cell.reborn();
//					}
//					else if(ner==2)
//					{
//					}
//					else
//					{
//						cell.die();
//					}
					switch(ner) {
					case 3:
						cell.reborn();
						break;
					case 2:
						break;
					default:
						cell.die();
					}
				}
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
			jframe.repaint();
		}
	}

}











