package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumbers {
    public List<LottoNumber> lottoNumberList = new ArrayList<>();
    public LottoNumbers() {
        for (int i = LottoPolicy.START_NUMBER; i < LottoPolicy.END_NUMBER; i++) {
            lottoNumberList.add(new LottoNumber(i));
        }
    }
}
