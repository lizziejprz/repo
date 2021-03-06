import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdultTest {
	Adult a1,a2,a3, a4, a5,a6;

	@Before
	public void setUp() throws Exception {
		//Evening movie (after 6 pm)
		a1 = new Adult("Movie One", "PG13", 4,18,"NONE");
		//Matinee (before 6 pm)
		a2 = new Adult("Movie One", "PG13", 3,13,"NONE");
		//Evening IMAX movie
		a3 = new Adult("Movie Two", "R", 5,19,"IMAX");
		//Matinee IMAX
		a4 = new Adult("Movie Two", "R", 2,12,"IMAX");
		//Evening 3D
		a5 = new Adult("Movie Three", "NR", 5,20,"3D");
		//Matinee 3D
		a6 = new Adult("Movie Three", "PNR", 3,15,"3D");
	}

	@After
	public void tearDown() throws Exception {
		a1=a2=a3=a4=a5=a6=null;
	}

	@Test
	public void test() {
		assertEquals(14.8,a1.calculateTicketPrice(),.01);
		assertEquals(11.51,a2.calculateTicketPrice(),.01);
		assertEquals(18.08,a3.calculateTicketPrice(),.01);
		assertEquals(14.8,a4.calculateTicketPrice(),.01);
		assertEquals(17.54,a5.calculateTicketPrice(),.01);
		assertEquals(14.25,a6.calculateTicketPrice(),.01);
	}
}
