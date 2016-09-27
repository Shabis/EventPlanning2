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
    testParty.setPartyFood(1);
    int expectedOutcome = 1;
    assertEquals(expectedOutcome, testParty.getPartyFood());
  }

  @Test
  public void setPartyBeverages_setTotalCostOfBeverages_400() {
    Party testParty = new Party();
    testParty.setPartyBeverages(2);
    int expectedOutcome = 2;
    assertEquals(expectedOutcome, testParty.getPartyBeverages());
  }

  @Test
  public void setPartyMusic_setTotalCostOfMusic_300() {
    Party testParty = new Party();
    testParty.setPartyMusic(1);
    int expectedOutcome = 1;
    assertEquals(expectedOutcome, testParty.getPartyMusic());
  }

  @Test
  public void setPartyEntertainment_setTotalCostOfEntertainment_1000() {
    Party testParty = new Party();
    testParty.setPartyEntertainment(2);
    int expectedOutcome = 2;
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
  public void testParty_calculateCostOfFood_700() {
    Party testParty = new Party();
    testParty.setPartyGuests(100);
    testParty.setPartyFood(1);
    int expectedOutcome = 700;
    assertEquals(expectedOutcome, testParty.calculateFoodCost());
  }

  @Test
  public void testParty_calculateCostOfBeverage_700() {
    Party testParty = new Party();
    testParty.setPartyGuests(100);
    testParty.setPartyBeverages(1);
    int expectedOutcome = 200;
    assertEquals(expectedOutcome, testParty.calculateBeverageCost());
  }

  @Test
  public void testParty_calculateCostOfMusic_700() {
    Party testParty = new Party();
    testParty.setPartyGuests(100);
    testParty.setPartyMusic(1);
    int expectedOutcome = 300;
    assertEquals(expectedOutcome, testParty.calculateMusicCost());
  }

  @Test
  public void testParty_calculateCostOfEntertainment_700() {
    Party testParty = new Party();
    testParty.setPartyEntertainment(1);
    int expectedOutcome = 350;
    assertEquals(expectedOutcome, testParty.calculateEntertainmentCost());
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
