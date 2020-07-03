package field;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import cell.Cell;
class FieldTest {

	Field field=new Field(50, 50);
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGet() {
		//fail("ипн╢й╣ож");
		Cell c=field.get(3, 4);
		assertEquals(c, field.field[2][4]);
		
	}
	@Test
	void   testgetneiber()
	{
//		int h=23;
//		int w=24;
		int count=0;
		for(int k=0;k<50;k++)
		{
			for(int d=0;d<50;d++)
			{
				for(int i=-1;i<2;i++)
				{
					for(int j=-1;j<2;j++)
					{
						int r=k+i;
						int c=d+j;
						if(r >-1 && r<50 && c>-1 && c<50 && !(r== k && c == d))
						{
							count++;
						}
					}
				}
				int len=field.getneiber(k, d).length;
				assertEquals(count, len);
				count=0;
			}
		}
	}

}
