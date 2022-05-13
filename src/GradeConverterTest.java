import org.junit.Before;
import org.junit.Test;
import static  org.junit.Assert.*;

class GradeConverterTest {
  private  GradeConverter converter;

  @Before
  void setUp() throws  Exception {
    converter = new  GradeConverter();
  }

  @Test
  void testconvert1() {
    String expected = "A";
    String actual = converter.convert(100);
    assertEquals(expected, actual);
  }

  @Test
  void testconvert2() {
    String expected = "A";
    String actual = converter.convert(90);
    assertEquals(expected, actual);
  }
    
}