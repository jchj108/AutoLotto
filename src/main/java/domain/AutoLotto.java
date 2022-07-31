package domain;

import exception.LackCostException;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AutoLotto {

    private List<LottoTicket> list = new ArrayList<LottoTicket>();
    private static final String LACK_COST_EXCEPTION_MSG = "금액은 " + LottoPolicy.COST + " 이상 입력해주세요.";

    public List<LottoTicket> getTicket(long payment) {
         if (payment < LottoPolicy.COST) {
             throw new LackCostException(LACK_COST_EXCEPTION_MSG);
        }
        long cnt = payment / LottoPolicy.COST;
        for (int i = 0; i < cnt; i++) {
            this.list.add(new LottoTicket());
        }
        return this.list;
    }
}
