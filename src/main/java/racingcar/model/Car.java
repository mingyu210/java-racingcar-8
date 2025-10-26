package racingcar.model;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(int randomNum){
        if(randomNum >=4){
            position += randomNum;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getPole(){
        return "-".repeat(position);
    }

}
