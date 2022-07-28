package domain;

import java.util.*;

public class LottoTicket {

    /*
        제약조건을 스스로 가지고 있는 클래스를 일급 컬렉션이라고 한다.
     */

    private static final int LOTTO_NUMBERS_SIZE = 6;
    public List<LottoNumbers> lottoNumbers;
    public final List<LottoNumbers> numList = new ArrayList<>();

    public LottoTicket() {
        for (int i = 1; i <= 45; i++) {
            numList.add(new LottoNumbers(i));
        }
        Collections.shuffle(numList);
        lottoNumbers = numList.subList(0, 6);
        Collections.sort(lottoNumbers);
    }
}
