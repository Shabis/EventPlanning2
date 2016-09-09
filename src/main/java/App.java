import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Party example = new Party("Summer Bash", 1000, 3, 2, 4, 3, 4000);

    List<Party> allPartys = new ArrayList<Party>();
    allPartys.add(example);

    boolean running = true;

    while(running) {
      System.out.println("Are you interested in receiving a quote for your next event? /t 'Yes' or 'No'");

      String mainMenu = myConsole.readLine();

      if (mainMenu.equalsIgnoreCase("Yes")) {

        //USER QUESTIONS///////////////////////////////////////////
        String userEventName = myConsole.readLine("What is the name of your event? \n");
        int userGuests = Integer.parseInt(myConsole.readLine("How many guest are you expecting? \n"));
        int userFood = Integer.parseInt(myConsole.readLine("Please select a food option for your event: \n 1) Spaghetti with salad and garlic break \n 2) Grilled Chicken with salad and rice pilaf \n 3) 8oz. Sirloin with caesar salad and a baked potato \n"));
        int userBeverages = Integer.parseInt(myConsole.readLine("Please select a beverage package for your event: \n 1) Water, soda, coffee & tea \n 2) All of option one plus beer & wine \n 3) All of options one and two with an open bar \n"));
        int userMusic = Integer.parseInt(myConsole.readLine("Please select a music package: \n 1) DJ \n 2) DJ with MC and karaoke \n 3) Live music \n"));
        int userEntertainment = Integer.parseInt(myConsole.readLine("Please select an entertainment option for your event: \n 1) Clown & Face Painting \n 2) Standup Comedian \n 3) none \n"));
        int userGiveaway = Integer.parseInt(myConsole.readLine("How much would you like to spend on giveaways (raffles, door prizes, swag bags)?\n"));
        /////////////////////////////////////////////////////////////

        Party userParty = new Party(userEventName, userGuests, userFood, userBeverages, userMusic, userEntertainment, userGiveaway);

        System.out.println("Here are the details of your party:");
        System.out.println( userParty.mName );
        System.out.println( "----------------------" );
        System.out.println( userParty.mGuests );
        System.out.println( userParty.mFood );
        System.out.println( userParty.mBeverages );
        System.out.println( userParty.mMusic );
        System.out.println( userParty.mEntertainment );
        System.out.println( userParty.mGiveaway );

      } else if (mainMenu.equalsIgnoreCase("No")) {
          System.exit(0);
      } else {
          System.out.println("I'm sorry, we don't recognize your input");
      }
    }
  }
}
