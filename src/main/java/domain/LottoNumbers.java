package domain;

import java.util.Objects;

public class LottoNumbers implements Comparable<LottoNumbers> {

    private static final String LOTTO_NUMBER_RANGE_EXCEPTION_MSG = "1과 45 사이의 숫자를 입력하세요";
    public int number;

    public LottoNumbers(int number) {
        validateNumber(number);
        this.number = number;
    }

    public static void validateNumber(int number) {
        if (number < LottoPolicy.START_NUMBER || number > LottoPolicy.END_NUMBER) {
            throw new IllegalArgumentException(LOTTO_NUMBER_RANGE_EXCEPTION_MSG);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(LottoNumbers o) {
        return Integer.compare(number, o.getNumber());
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof LottoNumbers) {
            return this.number == ((LottoNumbers) o).number;
        }
        return false;
    }
}
