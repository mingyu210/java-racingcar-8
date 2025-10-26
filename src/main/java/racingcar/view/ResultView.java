package racingcar.view;

import racingcar.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    public void printRoundResult(List<Car> cars) {
        for(Car car : cars) {
            System.out.println(car.getName()+ " : " + car.getPole());
        }
        System.out.println();
    }

    public void printWinners(List<Car> winners) {
        String winnerNames = winners.stream().map(Car::getName).collect(Collectors.joining(", "));
        System.out.println(winnerNames);
    }
}
