import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;


public class LotteryQueue {
    Random random;
    static int num = 0;
    PriorityQueue <LotteryParticipant> lotteryParticipantQueue; 

    public LotteryQueue(PriorityQueue<LotteryParticipant> lotteryParticipantQueue) {
        this.lotteryParticipantQueue = lotteryParticipantQueue;
    }

    public static ArrayList<Toy> compileToysListForLottery() {
        ArrayList <Toy> toysForLottery = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            Random random = new Random();
            int randomNum = random.nextInt(0, 6);
            String toyName;
            double toyLootChance;
            if (randomNum == 0) {
                toyName = "Конструктор";
                toyLootChance = 0.20;
            } else if (randomNum == 1) {
                toyName = "Робот";
                toyLootChance = 0.20;
            } else {
                toyName = "Кукла";
                toyLootChance = 0.60;
            }
            Toy newToy = new Toy(num++, toyName, toyLootChance);
            toysForLottery.add(newToy);
        }
        return toysForLottery;
        
    }
    public void getLotteryPrice(){

    }
}
