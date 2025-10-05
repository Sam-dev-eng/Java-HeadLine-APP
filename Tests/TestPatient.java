import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPatient {


    @Test
    public void TestPatient() {
        Patient pat = new Patient("sam", 22, "05908557", "Head ache");
        assertEquals(22, pat.getAge());
        assertEquals("Head ache",pat.getReason());
        assertEquals("sam", pat.getName());
        assertEquals("05908557", pat.getContact());

    }

    @Test
    public void TestPatientList() {
        Patient pat = new Patient("Emma", 23, "05900057", "Stomach ache");
        Patient pat2 = new Patient("Sam", 22, "05908557", "Head ache");
        assertEquals(22, pat.getPatients().get(pat2.getPatients().indexOf(pat2)).getAge());
    }
}
