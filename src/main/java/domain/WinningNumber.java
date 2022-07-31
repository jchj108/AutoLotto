package domain;

import java.util.ArrayList;
import java.util.List;

public class WinningNumber {
    public static String LOTTO_SIZE_EXCEPTION_MSG = "6개의 숫자를 입력해주세요.";

    public List<LottoNumber> winningNumbers = new ArrayList<>();

    public WinningNumber(List<LottoNumber> winningNumbers) {
        if(winningNumbers.size() != LottoPolicy.LOTTO_NUMBERS_SIZE) {
            throw new IllegalArgumentException(LOTTO_SIZE_EXCEPTION_MSG);
        }
        this.winningNumbers = winningNumbers;
    }
}
