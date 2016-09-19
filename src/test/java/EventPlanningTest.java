import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventPlanningTest {

  @Test
  public void EventPlanning_testRandomAnswers_Array() {
    Party testParty = new Party();
  }

  @Test
  public void setPartyName_setNameOfTheParty_String() {
    Party testParty = new Party();
    testParty.setPartyName("Summer Shindig");
    String expectedOutcome = "Summer Shindig";
    assertEquals(expectedOutcome, testParty.getPartyName());
  }

  @Test
  public void setPartyGuests_setNumberOfGuest_200() {
    Party testParty = new Party();
    testParty.setPartyGuests(200);
    int expectedOutcome = 200;
    assertEquals(expectedOutcome, testParty.getPartyGuests());
  }

  @Test
  public void setPartyFood_setTotalCostofFood_1400() {
    Party testParty = new Party();
    testParty.setPartyFood(1400);
    int expectedOutcome = 1400;
    assertEquals(expectedOutcome, testParty.getPartyFood());
  }

  @Test
  public void setPartyBeverages_setTotalCostOfBeverages_400() {
    Party testParty = new Party();
    testParty.setPartyBeverages(400);
    int expectedOutcome = 400;
    assertEquals(expectedOutcome, testParty.getPartyBeverages());
  }

  @Test
  public void setPartyMusic_setTotalCostOfMusic_300() {
    Party testParty = new Party();
    testParty.setPartyMusic(300);
    int expectedOutcome = 300;
    assertEquals(expectedOutcome, testParty.getPartyMusic());
  }

  @Test
  public void setPartyEntertainment_setTotalCostOfEntertainment_1000() {
    Party testParty = new Party();
    testParty.setPartyEntertainment(1000);
    int expectedOutcome = 1000;
    assertEquals(expectedOutcome, testParty.getPartyEntertainment());
  }

  @Test
  public void setPartyGiveaway_setGiveawayOfTheParty_2000() {
    Party testParty = new Party();
    testParty.setPartyGiveaway(2000);
    int expectedOutcome = 2000;
    assertEquals(expectedOutcome, testParty.getPartyGiveaway());
  }

  @Test
  public void calculateTotalCost_findTotalCostOfEvent_5100() {
    Party testParty = new Party();
    testParty.setPartyName("Summer Shindig");
    testParty.setPartyGuests(200);
    testParty.setPartyFood(1400);
    testParty.setPartyBeverages(400);
    testParty.setPartyMusic(300);
    testParty.setPartyEntertainment(1000);
    testParty.setPartyGiveaway(2000);
    testParty.calculateTotalCost();
    int expectedOutcome = 5100;
    assertEquals(expectedOutcome, testParty.calculateTotalCost());
  }
}
