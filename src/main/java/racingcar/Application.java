package racingcar;

import racingcar.controller.RacingGameController;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        RacingGameController controller = new RacingGameController(inputView, resultView);
        controller.start();
    }
}
