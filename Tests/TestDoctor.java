import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestDoctor {


    @Test
    public void testTheDoctor(){
        Doctor doc = new Doctor("ade", 22, "080404840","cadiology", "1-2" );
        assertEquals("ade", doc.getName());
        assertEquals(22, doc.getAge());
        assertEquals("080404840", doc.getContact());
        assertEquals("cadiology", doc.getDepartment());
        assertEquals("1-2", doc.getTimeOfWork());

    }

    @Test
    public void testTheDoctorList(){
      Doctor doc = new Doctor("ade", 22, "080404840","cadiology", "1-2");
      Doctor doc2 = new Doctor("Emma", 33, "08000000","surgeon", "1-24");
      assertEquals("Emma", doc.getDoctors().get(doc.getDoctors().indexOf(doc2)).getName());

    }

}
