package racingcar.view;


import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;


public class InputView {

    public List<String> inputCarNames() {
        System.out.println("자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String input = Console.readLine().trim();

        if(input.isEmpty()){
            throw new IllegalArgumentException("자동차 이름을 한 개 이상 입력해야 합니다.");
        }

        List<String> carNames = Arrays.asList(input.split(","));

        return carNames;

    }

    public int inputTryCount(){
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine().trim();
        int count = Integer.parseInt(input);
        return count;
    }
}
