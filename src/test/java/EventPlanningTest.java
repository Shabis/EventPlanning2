import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventPlanningTest {

@Test
public void EventPlanning_testRandomAnswers_Array() {
  Party testParty = new Party("hello", 3, 3, 3, 3, 3, 3);
}

@Test
public void EventPlanning_testRandomAnswersWithSecondNumberIncorrect_Array() {
  Party testParty = new Party("hello", -9, 3, 3, 3, 3, 3);
}

@Test
public void EventPlanning_testRandomAnswersWithThirdNumberCalculatingfromGuestTotal_Array() {
  Party testParty = new Party("hello", 100, 1, 1, 3, 3, 3);
}
}
