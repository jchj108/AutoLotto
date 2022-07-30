package domain;

import java.util.ArrayList;
import java.util.List;

public class WinningNumber {

    public static String LOTTO_SIZE_EXCEPTION = "6개의 숫자를 입력해주세요.";

    public List<LottoNumbers> winningNumbers = new ArrayList<>();

    public WinningNumber(List<LottoNumbers> winningNumbers) {

        if(winningNumbers.size() != Constant.LOTTO_NUMBER_SIZE) {
            throw new IllegalArgumentException(LOTTO_SIZE_EXCEPTION);
        }
        this.winningNumbers = winningNumbers;
    }
}
