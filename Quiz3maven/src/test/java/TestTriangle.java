import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTriangle {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void AreaTest() {
		Triangle testTri = new Triangle(3,4,5);
		double expectedArea = 6.0;
		double actualArea = testTri.getArea();
		assertEquals(expectedArea,actualArea,0.001);	
	}
	
	@Test
	public void PerimeterTest() {
		Triangle testTri = new Triangle(3,4,5);
		double expectedPer = 12.0;
		double actualPer = testTri.getPerimeter();
		assertEquals(expectedPer,actualPer,0.001);
	}

}
