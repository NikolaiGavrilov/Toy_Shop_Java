public abstract class Toy {
    private int toyType;
    private int toyID;
    private String toyName;
    private int toyLootChance;

    public Toy(int toyType, int toyID, String toyName, int toyLootChance) {
        this.toyType = toyType;
        this.toyID = toyID;
        this.toyName = toyName;
        this.toyLootChance = toyLootChance;
    }

    public int getToyType() {
        return toyType;
    }

    public void setToyType(int toyType) {
        this.toyType = toyType;
    }

    public int getToyID() {
        return toyID;
    }

    public void setToyID(int toyID) {
        this.toyID = toyID;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getToyLootChance() {
        return toyLootChance;
    }

    public void setToyLootChance(int toyLootChance) {
        this.toyLootChance = toyLootChance;
    }

    @Override
    public String toString() {
        return "Игрушка [id=" + this.toyID + ", название=" + this.toyName + ", шанс выпадения=" + this.toyLootChance + "]";
    }
    

    

    
}