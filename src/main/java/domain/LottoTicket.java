package domain;

import java.util.*;

public class LottoTicket {

    private static final int LOTTO_NUMBERS_SIZE = 6;
    public List<LottoNumbers> lottoNumbers;


    public LottoTicket() {
        List<LottoNumbers> numList = new ArrayList<>();

        for (int i = 1; i <= 45; i++) {
            numList.add(new LottoNumbers(i));
        }
        Collections.shuffle(numList);
        lottoNumbers = numList.subList(0, LOTTO_NUMBERS_SIZE);
        Collections.sort(lottoNumbers);
    }
}
