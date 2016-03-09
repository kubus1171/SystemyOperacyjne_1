/**
 * Created by kamo on 09.03.16.
 */
public class Proces {
    private int duration;
    private int waitingTime=0;
    private int timeOfEntry;
    private boolean complete = false;

    public Proces(int duration, int timeOfEntry) {
        this.duration = duration;
        this.timeOfEntry = timeOfEntry;
    }

    public void setComplete(){
        this.complete=true;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void decrementDuration(){
        if(duration-1==0) {
            duration=0;
        }
        else
            duration--;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public void incrementWaitingTime(){
        this.waitingTime++;
    }

    public int getTimeOfEntry() {
        return timeOfEntry;
    }

    public void setTimeOfEntry(int timeOfEntry) {
        this.timeOfEntry = timeOfEntry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Proces proces = (Proces) o;

        if (duration != proces.duration) return false;
        if (waitingTime != proces.waitingTime) return false;
        return timeOfEntry == proces.timeOfEntry;

    }

    @Override
    public int hashCode() {
        int result = duration;
        result = 31 * result + waitingTime;
        result = 31 * result + timeOfEntry;
        return result;
    }

    public boolean isComplete() {
        if(duration==0)
            return true;
        else
            return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
