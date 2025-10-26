package racingcar.controller;

import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingGameController {
    private final InputView inputView;
    private final ResultView resultView;

    public RacingGameController(InputView inputView, ResultView resultView) {
        this.inputView = inputView;
        this.resultView = resultView;
    }
}
