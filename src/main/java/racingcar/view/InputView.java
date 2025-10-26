package racingcar.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);

    public List<String> inputCarNames() {
        System.out.println("자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = scanner.nextLine().trim();

        List<String> carNames = Arrays.asList(input.split(","));

        return carNames;

    }
}
