package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumbers {

    private List<LottoNumber> lottoNumberList = new ArrayList<>();

    private static LottoNumbers instance = new LottoNumbers();

    private LottoNumbers() {
        for (int i = LottoPolicy.START_NUMBER; i < LottoPolicy.END_NUMBER; i++) {
            lottoNumberList.add(new LottoNumber(i));
        }
    }

    public static LottoNumbers getInstance() {
        return instance;
    }

    public List<LottoNumber> getLottoTicket() {
        Collections.shuffle(this.lottoNumberList);
        return lottoNumberList.subList(0, 6);
    }
}
