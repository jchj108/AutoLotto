package domain;

import java.util.*;

public class LottoTicket {

    public List<LottoNumbers> lottoNumbers;

    public LottoTicket() {
        List<LottoNumbers> numList = new ArrayList<>();

        for (int i = LottoPolicy.START_NUMBER; i <= LottoPolicy.END_NUMBER; i++) {
            numList.add(new LottoNumbers(i));
        }
        Collections.shuffle(numList);
        lottoNumbers = numList.subList(0, LottoPolicy.LOTTO_NUMBERS_SIZE);
        Collections.sort(lottoNumbers);
    }
}
