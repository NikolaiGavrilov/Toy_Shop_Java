public class Toy {
    private int toyID;
    private String toyName;
    private double toyLootChance;

    public Toy(int toyID, String toyName, double toyLootChance) {
        this.toyID = toyID;
        this.toyName = toyName;
        this.toyLootChance = toyLootChance;
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

    public double getToyLootChance() {
        return toyLootChance;
    }

    public void setToyLootChance(double toyLootChance) {
        this.toyLootChance = toyLootChance;
    }

    @Override
    public String toString() {
        return "Игрушка [id=" + this.toyID + ", название=" + this.toyName + ", шанс выпадения=" + this.toyLootChance + "]";
    }
    

    

    
}