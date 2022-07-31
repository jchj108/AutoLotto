package domain;

import java.util.*;

public class LottoTicket {

    public List<LottoNumber> autoLottoNumbers;

    public LottoTicket() {
        List<LottoNumber> numList = LottoNumbers.getInstance().getLottoTicket();
//        for (int i = LottoPolicy.START_NUMBER; i <= LottoPolicy.END_NUMBER; i++) {
//            numList.add(new LottoNumber(i));
//        }
        Collections.shuffle(numList);
        autoLottoNumbers = numList.subList(0, LottoPolicy.LOTTO_NUMBERS_SIZE);
        Collections.sort(autoLottoNumbers);
    }
}
