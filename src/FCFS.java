import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by kamo on 09.03.16.
 */
public class FCFS {

    private ArrayList<Proces> procesList;

    public double run(ArrayList<Proces> mProcesses) {

        this.procesList = mProcesses;

        Collections.sort(procesList, new EntryComparator());
        printProcesses();

        double averageWaitingTime=0;
        int waitingTime=0;

        for (int i = 0; i < procesList.size(); i++) {
            if (!procesList.get(i).isComplete()) {
                int durationTime=procesList.get(i).getDuration();
                for (int j = 0; j<durationTime; j++) {
                    for (int k = 0; k < procesList.size(); k++) {
                        if (!procesList.get(k).isComplete()) {
                            if (k == i) {
                                procesList.get(k).decrementDuration();
                            }
                            else if(!procesList.get(k).isComplete()) {
                                procesList.get(k).incrementWaitingTime();
                                waitingTime++;
                            }
                        }
                    }
                    System.out.print("\033[H\033[2J");
                    printProcesses();
                    try {
                        Thread.sleep(2000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        averageWaitingTime=waitingTime/procesList.size();
        return averageWaitingTime;
    }

    public void printProcesses(){
        System.out.printf("%15s | %15s | %15s", "Moment zgloszenia", "Czas trwania", "Okres oczekiwania"+"\n");
        for(Proces proces: procesList){
            System.out.printf("%17s | %15s | %15s", proces.getTimeOfEntry(), proces.getDuration(), proces.getWaitingTime()+"\n");
        }
    }
}
