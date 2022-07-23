package domain;

import java.util.*;

public class LottoTicket {

    /*
        제약조건을 스스로 가지고 있는 클래스를 일급 컬렉션이라고 한다.
     */

    private static final int LOTTO_NUMBERS_SIZE = 6;

    public List<Integer> lottoNumbers;
    public final List<Integer> numList = new ArrayList<>();

    public LottoTicket() {
        for (int i = 1; i <= 45; i++) {
            numList.add(i);
        }
        Collections.shuffle(numList);
        lottoNumbers = numList.subList(0, 6);
    }

    @Override
    public String toString() {
        return String.valueOf(lottoNumbers);
    }
}
