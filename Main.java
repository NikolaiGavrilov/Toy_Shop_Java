import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Toy> listOfToys = new ArrayList<>();
        listOfToys = LotteryQueue.compileToysListForLottery();
        System.out.println(listOfToys);
    }
}
