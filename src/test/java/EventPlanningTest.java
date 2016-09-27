import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventPlanningTest {

  @Test
  public void EventPlanning_testRandomAnswers_Array() {
    Party testParty = new Party("Summer Shindig", 200, 1, 1, 1, 1, 3000);
  }

  @Test
  public void getPartyName_getNameOfTheParty_String() {
    Party testParty = new Party("Summer Shindig", 200, 1, 1, 1, 1, 3000);
    String expectedOutcome = "Summer Shindig";
    assertEquals(expectedOutcome, testParty.getPartyName());
  }

  @Test
  public void getPartyGuests_getNumberOfGuest_200() {
    Party testParty = new Party("Summer Shindig", 200, 1, 1, 1, 1, 3000);
    int expectedOutcome = 200;
    assertEquals(expectedOutcome, testParty.getPartyGuests());
  }

  @Test
  public void getPartyFood_getTotalCostofFood_1400() {
    Party testParty = new Party("Summer Shindig", 200, 1, 1, 1, 1, 3000);
    int expectedOutcome = 1;
    assertEquals(expectedOutcome, testParty.getPartyFood());
  }

  @Test
  public void getPartyBeverages_getTotalCostOfBeverages_400() {
    Party testParty = new Party("Summer Shindig", 200, 1, 1, 1, 1, 3000);
    int expectedOutcome = 1;
    assertEquals(expectedOutcome, testParty.getPartyBeverages());
  }

  @Test
  public void getPartyMusic_getTotalCostOfMusic_300() {
    Party testParty = new Party("Summer Shindig", 100, 1, 1, 1, 1, 3000);
    int expectedOutcome = 1;
    assertEquals(expectedOutcome, testParty.getPartyMusic());
  }

  @Test
  public void getPartyEntertainment_getTotalCostOfEntertainment_1000() {
    Party testParty = new Party("Summer Shindig", 100, 1, 1, 1, 1, 3000);
    int expectedOutcome = 1;
    assertEquals(expectedOutcome, testParty.getPartyEntertainment());
  }

  @Test
  public void getPartyGiveaway_getGiveawayOfTheParty_2000() {
    Party testParty = new Party("Summer Shindig", 100, 1, 1, 1, 1, 3000);
    int expectedOutcome = 3000;
    assertEquals(expectedOutcome, testParty.getPartyGiveaway());
  }

  @Test
  public void testParty_calculateCostOfFood_700() {
    Party testParty = new Party("Summer Shindig", 100, 1, 1, 1, 1, 3000);
    int expectedOutcome = 700;
    assertEquals(expectedOutcome, testParty.calculateFoodCost());
  }

  @Test
  public void testParty_calculateCostOfBeverage_700() {
    Party testParty = new Party("Summer Shindig", 100, 1, 1, 1, 1, 3000);
    int expectedOutcome = 200;
    assertEquals(expectedOutcome, testParty.calculateBeverageCost());
  }

  @Test
  public void testParty_calculateCostOfMusic_700() {
    Party testParty = new Party("Summer Shindig", 100, 1, 1, 1, 1, 3000);
    int expectedOutcome = 300;
    assertEquals(expectedOutcome, testParty.calculateMusicCost());
  }

  @Test
  public void testParty_calculateCostOfEntertainment_700() {
    Party testParty = new Party("Summer Shindig", 100, 1, 1, 1, 1, 3000);
    int expectedOutcome = 350;
    assertEquals(expectedOutcome, testParty.calculateEntertainmentCost());
  }

  @Test
  public void calculateTotalCost_findTotalCostOfEvent_5100() {
    Party testParty = new Party("Summer Shindig", 100, 1, 1, 1, 1, 2000);
    testParty.calculateFoodCost();
    testParty.calculateBeverageCost();
    testParty.calculateMusicCost();
    testParty.calculateEntertainmentCost();
    int expectedOutcome = 3550;
    assertEquals(expectedOutcome, testParty.calculateTotalCost());
  }
}
