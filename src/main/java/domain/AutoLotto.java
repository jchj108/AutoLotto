package domain;

import exception.LackCostException;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AutoLotto {

    private final List<LottoTicket> list = new ArrayList<LottoTicket>();
    public static final long COST = 1000;
    private static final String LackCostExceptionMsg = "금액은 " + COST + " 이상 입력해주세요.";

    public List<LottoTicket> getTicket(long payment) {
         if (payment < 1000) {
             throw new LackCostException(LackCostExceptionMsg);
        }
        long cnt = payment / COST;
        for (int i = 0; i < cnt; i++) {
            this.list.add(new LottoTicket());
        }
        return this.list;
    }
}
