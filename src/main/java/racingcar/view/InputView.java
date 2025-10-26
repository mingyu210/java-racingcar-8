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

    private void validateCarNames(List<String> carNames) {
        long distinctCount = carNames.stream().distinct().count();
        if(distinctCount != carNames.size()){
            throw new IllegalArgumentException("자동차 이름이 중복되었습니다.");
        }

        for(String name : carNames){
            if(name.trim().length() > 5){
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다: " + name.trim());
            }
        }

    }

    public int inputTryCount(){
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine().trim();
        try{
            int count = Integer.parseInt(input);
            if(count <=0){
                throw new IllegalArgumentException("시도 횟수는 1 이상의 정수여야 합니다.");
            }
            return count;
        } catch(NumberFormatException e){
            throw new IllegalArgumentException("숫자를 입력해야 합니다.");
        }
    }
}
