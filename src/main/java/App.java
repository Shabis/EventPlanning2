import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    // List<Party> allPartys = new ArrayList<Party>();
    // allPartys.add(userParty);
    //
    boolean running = true;
    boolean invalidAnswer;

    while(running) {
      System.out.println("Are you interested in receiving a quote for your next event? \t 'Yes' or 'No'");

      String mainMenu = myConsole.readLine();

      if (mainMenu.equalsIgnoreCase("Yes")) {

        //USER QUESTIONS///////////////////////////////////////////
        String userEventName = myConsole.readLine("What is the name of your event? \n");
        int userGuests;
         do {
           userGuests = Integer.parseInt(myConsole.readLine("How many guest are you expecting? \n"));
           invalidAnswer = (userGuests < 0);
           if (invalidAnswer) {
             System.out.println("Choose a different number \n");
           }
          } while(invalidAnswer);
        //FOOD OPTION/////
        int userFood = Integer.parseInt(myConsole.readLine("Please select a food option for your event: \n 1) Spaghetti with salad and garlic break \n 2) Grilled Chicken with salad and rice pilaf \n 3) 8oz. Sirloin with caesar salad and a baked potato \n"));

        //BEVERAGE OPTION/////
        int userBeverages = Integer.parseInt(myConsole.readLine("Please select a beverage package for your event: \n 1) Water, soda, coffee & tea \n 2) All of option one plus beer & wine \n 3) All of options one and two with an open bar \n"));

        //MUSIC OPTION/////
        int userMusic = Integer.parseInt(myConsole.readLine("Please select a music package: \n 1) DJ \n 2) DJ will also provide MC and karaoke \n 3) Live music \n"));

        //ENTERTAINMENT OPTION/////
        int userEntertainment = Integer.parseInt(myConsole.readLine("Please select an entertainment option for your event: \n 1) Clown & Face Painting \n 2) Standup Comedian \n 3) none \n"));

        //GIVEAWAY OPTION/////
        int userGiveaway = Integer.parseInt(myConsole.readLine("How much would you like to spend on giveaways (raffles, door prizes, swag bags)?\n"));

        Party userParty = new Party(userEventName, userGuests, userFood, userBeverages, userMusic, userEntertainment, userGiveaway);

        /////////////////////////////////////////////////////////////

        System.out.println("Here are the details of your party: \n\n");
        System.out.println( "\t\t\t" + userParty.getPartyName().toUpperCase());
        System.out.println( "_______________________________________________________" );
        System.out.println( "Total Number of Guests: " + userParty.getPartyGuests());
        System.out.println( "Total Food Cost \t\t\t\t $" + userParty.calculateFoodCost());
        System.out.println( "Total Beverage Cost \t\t\t\t $" + userParty.calculateBeverageCost());
        System.out.println( "Total Music Cost \t\t\t\t $" + userParty.calculateMusicCost());
        System.out.println( "Total Entertainment Cost \t\t\t $" + userParty.calculateEntertainmentCost());
        System.out.println( "Total Giveaway Cost \t\t\t\t $" + userParty.getPartyGiveaway());
        System.out.println( "_______________________________________________________" );
        System.out.println( "The Total Estimated Cost for " + userParty.getPartyName() + " is $" + userParty.calculateTotalCost());
        System.out.println( "_______________________________________________________\n\n" );

      } else if (mainMenu.equalsIgnoreCase("No")) {
          System.out.println("Thanks for visiting! Goodbye");
          System.exit(0);
      } else {
          System.out.println("I'm sorry, we don't recognize your input");
      }
    }
  }
}
