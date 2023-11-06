import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

import javax.management.RuntimeErrorException;


public class LotteryQueue {
    static Random random = new Random();
    static int num = 12300;
    static int numParticipant = 10100;
    
    public static PriorityQueue <LotteryParticipant> compileLotteryParticipantQueue(){
        PriorityQueue <LotteryParticipant> participantsQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            LotteryParticipant participant = new LotteryParticipant(numParticipant++, LotteryParticipant.generateRandomName(), LotteryParticipant.generateRandomSurname());
            participantsQueue.add(participant);
        }
        return participantsQueue;
    }; 

    public static ArrayList<Toy> compileToysListForLottery() {
        ArrayList <Toy> toysForLottery = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            Random random = new Random();
            int randomNum = random.nextInt(0, 5);
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
            num+=random.nextInt(1000);
            Toy newToy = new Toy(num, toyName, toyLootChance);
            toysForLottery.add(newToy);
        }
        return toysForLottery; 
    }

    public static void deliverLotteryPrises(PriorityQueue <LotteryParticipant> participantsQueue, ArrayList <Toy> toysForLottery){
        if (participantsQueue.size() == toysForLottery.size()) {
            WriteToFile.writeDataToFile("ИТОГИ ЛОТЕРЕИ:\n");
            int index;
            for (index = 0; index < toysForLottery.size(); index++){
                WriteToFile.writeDataToFile(participantsQueue.peek() + "получает приз " + toysForLottery.get(index) + "\n");
                System.out.println(participantsQueue.remove() + "получает приз " + toysForLottery.get(index));
                if (participantsQueue.size() == 0 || toysForLottery.size() == 0){
                    System.out.println("Лотерея завершена");
                    
                }
            }
            toysForLottery.clear();
            participantsQueue.clear();
            WriteToFile.writeDataToFile("ЛОТЕРЕЯ ЗАВЕРШЕНА!\n\n");
        }
        else throw new RuntimeException("Несовпадение кол-ва участников и призов, лотерею придется отложить");
    }
}
