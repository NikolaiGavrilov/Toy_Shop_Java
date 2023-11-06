import java.util.Random;

public class LotteryParticipant implements Comparable{

    private int id;
    private String name;
    private String surname;
    
    public LotteryParticipant(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static String generateRandomName(){
        String [] listOfNames = {"Михаил", "Владислав", "Никита", "Николай", "Александр", 
        "Алексей", "Борис", "Вячеслав", "Дмитрий", "Анатолий", "Владимир", "Илья", "Иван", 
        "Раиль", "Аркадий", "Глеб", "Сергей", "Святослав", "Ярослав", "Вадим", "Савелий"};
        Random random = new Random();
        int randomNameNumber = random.nextInt(0, listOfNames.length);
        return listOfNames[randomNameNumber];
    }

    public static String generateRandomSurname(){
        String [] listOfSurnames = {"Агапов", "Абрамов", "Баданов", "Борисов", "Васильев", 
        "Весёлов", "Гергиев", "Головин", "Горбатов", "Далёков", "Добрынин", "Дементьев", "Елизаров", 
        "Жарков", "Забойкин", "Зюзин", "Калинин", "Костерев", "Латыпов", "Лопатин", "Москвин"};
        Random random = new Random();
        int randomSurnameNumber = random.nextInt(0, listOfSurnames.length);
        return listOfSurnames[randomSurnameNumber];
    }

    @Override
    public String toString() {
        return "Участник лотереи " + this.name + " " + this.surname + ", id: " + this.id +"\n";
    }
    @Override
    public int compareTo(Object o) {
        if (this.id > ((LotteryParticipant)o).getId()) return 1;
        else if (this.id < ((LotteryParticipant)o).getId()) return -1;
        else return 0;
    }

   
}
