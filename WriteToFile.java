import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void writeDataToFile(String string) {
        try (FileWriter writer = new FileWriter("LotteryResults.json", true)) {
            writer.write(string);
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
    }

}
}