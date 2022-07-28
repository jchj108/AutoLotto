package domain;

public class LottoNumbers implements Comparable<LottoNumbers> {

    private static final int startNumber = 1;
    private static final int endNumber = 45;
    private static final String LottoNumberRangeExceptionMessage = "1과 45 사이의 숫자를 입력하세요";
    private static int number;

    public LottoNumbers(int number) {
        validateNumber(number);
        this.number = number;
    }

    public static void validateNumber(int number) {
        if (number < startNumber || number > endNumber) {
            throw new IllegalArgumentException(LottoNumberRangeExceptionMessage);
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
}
