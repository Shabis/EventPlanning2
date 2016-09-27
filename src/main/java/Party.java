class Party {
  private String mName;
  private int mGuests;
  private int mFood;
  private int mBeverages;
  private int mMusic;
  private int mEntertainment;
  private int mGiveaway;

  public Party() {
  }

  public void setPartyName(String partyName) {
    mName = partyName;
  }

  public String getPartyName() {
    return mName;
  }

  public void setPartyGuests(int partyGuests) {
    mGuests = partyGuests;
  }

  public int getPartyGuests() {
    return mGuests;
  }

  public void setPartyFood(int partyFood) {
    mFood = partyFood;
  }

  public int getPartyFood() {
    return mFood;
  }

  public void setPartyBeverages(int partyBeverages) {
    mBeverages = partyBeverages;
  }

  public int getPartyBeverages() {
    return mBeverages;
  }

  public void setPartyMusic(int partyMusic) {
    mMusic = partyMusic;
  }

  public int getPartyMusic() {
    return mMusic;
  }

  public void setPartyEntertainment(int partyEntertainment) {
    mEntertainment = partyEntertainment;
  }

  public int getPartyEntertainment() {
    return mEntertainment;
  }

  public void setPartyGiveaway(int partyGiveaway) {
    mGiveaway = partyGiveaway;
  }

  public int getPartyGiveaway() {
    return mGiveaway;
  }

  public int calculateFoodCost() {
    Integer[] foodCost = {0, 7, 12, 23};
    mFood = foodCost[mFood] * mGuests;
    return mFood;
  }

  public int calculateBeverageCost() {
    Integer[] beverageCost = {0, 2, 7, 1 };
    mBeverages = beverageCost[mBeverages] * mGuests;
    return mBeverages;
  }

  public int calculateMusicCost() {
    Integer[] musicCost = {0, 300, 500, 1500 };
    mMusic = musicCost[mMusic];
    return mMusic;
  }

  public int calculateEntertainmentCost() {
    Integer[] entertainmentCost = {0, 350, 1000, 0 };
    mEntertainment = entertainmentCost[mEntertainment];
    return mEntertainment;
  }

  public int calculateTotalCost() {
    return mFood + mBeverages + mMusic + mEntertainment +  mGiveaway;
  }
}
