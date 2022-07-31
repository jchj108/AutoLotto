package domain;

import java.util.*;

public class LottoTicket {

    public List<LottoNumber> autoLottoNumbers;
    public static LottoNumbers lottoNumbers;

    public LottoTicket() {
        LottoNumbers lottoNumbers = new LottoNumbers();
        Collections.shuffle(lottoNumbers.lottoNumberList);
        autoLottoNumbers = lottoNumbers.lottoNumberList.subList(0, LottoPolicy.LOTTO_NUMBERS_SIZE);
        Collections.sort(autoLottoNumbers);
    }
}
