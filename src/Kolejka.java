import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kamo on 09.03.16.
 */
public class Kolejka {

    private ArrayList<Proces> procesList = new ArrayList<>();

    public int size(){
        return procesList.size();
    }

    public ArrayList<Proces> getAllProces(){
        return procesList;
    }

    public void putAllProces(ArrayList<Proces> procesList){
        this.procesList=procesList;
    }

    public void printProcesses(){
        System.out.printf("%5s | %5s | %5s", "Moment zgloszenia", "Czas trwania", "Okres oczekiwania"+"\n");
        for(Proces proces: procesList){
            System.out.printf("%5s | %5s | %5s", proces.getTimeOfEntry(), proces.getDuration(), proces.getWaitingTime()+"\n");
        }
    }

    public void generateProcesses(int count, int maxTimeOfEntry, int maxDuration){

        for(int i=0; i<count; i++) {
            Random random = new Random();
            int duration = random.nextInt(maxDuration)+1;
            int timeOfEntry = random.nextInt(maxTimeOfEntry);
            Proces proces = new Proces(duration,timeOfEntry);
            procesList.add(proces);
        }

    }
}
