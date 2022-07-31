package domain;

public class LottoNumber implements Comparable<LottoNumber> {

    private static final String LOTTO_NUMBER_RANGE_EXCEPTION_MSG = "1과 45 사이의 숫자를 입력하세요";
    public int number;

    public LottoNumber(int number) {
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
    public int compareTo(LottoNumber o) {
        return Integer.compare(number, o.getNumber());
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof LottoNumber) {
            return this.number == ((LottoNumber) o).number;
        }
        return super.equals(o);
    }
}
