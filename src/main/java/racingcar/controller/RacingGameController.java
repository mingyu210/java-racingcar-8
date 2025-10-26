package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;
import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class RacingGameController {
    private final InputView inputView;
    private final ResultView resultView;

    public RacingGameController(InputView inputView, ResultView resultView) {
        this.inputView = inputView;
        this.resultView = resultView;
    }

    public void start(){
        List<Car> cars = createCars();
        int tryCount = inputTryCount();

        System.out.println("\n실행 결과");
        play(cars, tryCount);

        List<Car> winners = findWinners(cars);
        resultView.printWinners(winners);

    }

    private List<Car> createCars() {
        List<String> carNames = inputView.inputCarNames();
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName.trim()));
        }
        return cars;
    }

    private int inputTryCount(){
        return inputView.inputTryCount();
    }

    private void play(List<Car> cars, int tryCount){
        for(int i=0; i<tryCount; i++){
            moveCars(cars);
            resultView.printRoundResult(cars);
        }
    }

    private void moveCars(List<Car> cars){
        for(Car car : cars){
            int randomNumber = Randoms.pickNumberInRange(0,9);
            car.move(randomNumber);
        }
    }

    private List<Car> findWinners(List<Car> cars){
        int maxPosition = cars.stream().mapToInt(Car::getPosition).max().orElse(0);
        List<Car> winners = new ArrayList<>();
        for(Car car : cars){
            if(car.getPosition() == maxPosition){
                winners.add(car);
            }
        }
        return winners;
    }
}
