public class Clock {

    private int hour;
    private int minute;

    public Clock(int hour, int minute){
        if (hour > 0 && hour < 24){
            this.hour = hour;
        }

        if (minute > 0 && minute < 60){
            this.minute = minute;
        }
    }

    public void addMinute(){
        if (minute == 59){
            minute = 0;

            if (hour == 23){
                hour = 0;
            } else {
                hour += 1;
            }
        } else {
            minute += 1;
        }
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public void setHour(int hour){
        if (hour > 0 && hour < 24){
            this.hour = hour;
        }
    }

    public void setMinute(int minute){
        if (minute > 0 && minute < 60){
            this.minute = minute;
        }

    }




}