import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        ArrayList <Toy> listOfToys = LotteryQueue.compileToysListForLottery();
        System.out.println("Игрушки для розыгрыша: " + listOfToys + "\n");
        PriorityQueue <LotteryParticipant> listOfParticipants = LotteryQueue.compileLotteryParticipantQueue();
        System.out.println("Участники розыгрыша: " + listOfParticipants + "\n");
        LotteryQueue.deliverLotteryPrises(listOfParticipants, listOfToys);
        System.out.println("Оставшиеся игрушки для розыгрыша: " + listOfToys + "\n");
        System.out.println("Оставшиеся участники розыгрыша: " + listOfParticipants + "\n");
    }
}
