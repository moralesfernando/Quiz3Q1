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
	public void AreaTest1() {
		Triangle testTri = new Triangle(3,4,5);
		double expectedArea = 6.0;
		double actualArea = testTri.getArea();
		assertEquals(expectedArea,actualArea,0.001);	
	}
	
	@Test
	public void AreaTest2() {
		Triangle testTri = new Triangle(3,3,5);
		double expectedArea = 4.146;
		double actualArea = testTri.getArea();
		assertEquals(expectedArea,actualArea,0.001);	
	}
	
	@Test
	public void AreaTest3() {
		Triangle testTri = new Triangle(4,4,5);
		double expectedArea = 7.806;
		double actualArea = testTri.getArea();
		assertEquals(expectedArea,actualArea,0.001);	
	}
	
	@Test
	public void AreaTest4() {
		Triangle testTri = new Triangle(5,5,7);
		double expectedArea = 12.497;
		double actualArea = testTri.getArea();
		assertEquals(expectedArea,actualArea,0.001);	
	}
	
	@Test
	public void PerimeterTest1() {
		Triangle testTri = new Triangle(3,4,5);
		double expectedPer = 12.0;
		double actualPer = testTri.getPerimeter();
		assertEquals(expectedPer,actualPer,0.001);
	}
	
	
	@Test
	public void PerimeterTest2() {
		Triangle testTri = new Triangle(3,3,5);
		double expectedPer = 11.0;
		double actualPer = testTri.getPerimeter();
		assertEquals(expectedPer,actualPer,0.001);
	}

	@Test
	public void PerimeterTest3() {
		Triangle testTri = new Triangle(4,4,5);
		double expectedPer = 13.0;
		double actualPer = testTri.getPerimeter();
		assertEquals(expectedPer,actualPer,0.001);
	}

	@Test
	public void PerimeterTest4() {
		Triangle testTri = new Triangle(5,5,7);
		double expectedPer = 17.0;
		double actualPer = testTri.getPerimeter();
		assertEquals(expectedPer,actualPer,0.001);
	}

	

}
