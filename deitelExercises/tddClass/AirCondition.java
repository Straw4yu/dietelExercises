package tddClass;

public class AirCondition {
    private String power;
    private int temperature;

    public void setPower(String status) {
        power = status;
    }

    public String getPower() {
        return power;
    }

    public void increaseTemperature(int temp1, int temp2) {
        if(temp2 > 30){temperature = 30;}
   if(temp1<temp2 && temp2 <30){temperature = temp2;}
    }
    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int temp1, int temp2) {
        if (temp1 > temp2) if (temp2 >= 16) if
        (temp1 <= 30) temperature = temp2;
        if (temp2 <= 16) temperature = 16;
        else temperature = temp1;
    }
}

