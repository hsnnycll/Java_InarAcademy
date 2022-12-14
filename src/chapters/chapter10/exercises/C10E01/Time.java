package chapters.chapter10.exercises.C10E01;

public class Time {

    private long hour;
    private long minute;
    private long second;

    public Time() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.second = totalSeconds % 60;
        this.minute = totalMinutes % 60;
        this.hour = totalHours % 24;
    }

    public Time(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
        this.minute = totalMinutes % 60;
        this.second = totalSeconds % 60;
    }

    public Time(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        return this.hour + ":" + this.minute + ":" + this.second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
}
