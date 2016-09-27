class Party {
  private String mName;
  private int mGuests;
  private int mFood;
  private int mBeverages;
  private int mMusic;
  private int mEntertainment;
  private int mGiveaway;

  public Party(String name, int guests, int food, int beverages, int music, int entertainment, int giveaway) {
    mName = name;
    mGuests = guests;
    mFood = food;
    mBeverages = beverages;
    mMusic = music;
    mEntertainment = entertainment;
    mGiveaway = giveaway;
    }

    int partyFood = 0;
    int partyMusic = 0;
    int partyBeverages = 0;
    int partyEntertainment = 0;

  public String getPartyName() {
    return mName;
  }

  public int getPartyGuests() {
    return mGuests;
  }

  public int getPartyFood() {
    return mFood;
  }

  public int getPartyBeverages() {
    return mBeverages;
  }

  public int getPartyMusic() {
    return mMusic;
  }

  public int getPartyEntertainment() {
    return mEntertainment;
  }

  public int getPartyGiveaway() {
    return mGiveaway;
  }

  public int calculateFoodCost() {
    Integer[] foodCost = {0, 7, 12, 23};
    partyFood = foodCost[mFood] * mGuests;
    return partyFood;
  }

  public int calculateBeverageCost() {
    Integer[] beverageCost = {0, 2, 7, 1 };
    partyBeverages = beverageCost[mBeverages] * mGuests;
    return partyBeverages;
  }

  public int calculateMusicCost() {
    Integer[] musicCost = {0, 300, 500, 1500 };
    partyMusic = musicCost[mMusic];
    return partyMusic;
  }

  public int calculateEntertainmentCost() {
    Integer[] entertainmentCost = {0, 350, 1000, 0 };
    partyEntertainment = entertainmentCost[mEntertainment];
    return partyEntertainment;
  }

  public int calculateTotalCost() {
    return partyFood + partyBeverages + partyMusic + partyEntertainment +  mGiveaway;
  }
}
