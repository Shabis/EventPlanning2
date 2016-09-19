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

  public int calculateTotalCost() {
    return mFood + mBeverages + mMusic + mEntertainment +  mGiveaway;
  }
}
