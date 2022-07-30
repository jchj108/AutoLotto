package domain;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AutoLotto {

    private final List<LottoTicket> list = new ArrayList<LottoTicket>();
    public static final long COST = 1000;

    public List<LottoTicket> getTicket(long payment) {
        if (payment < COST) {
            throw new IllegalArgumentException("금액이 부족합니다.");
        }
        // while 대신 cost로 나눠서 티켓팅하기
        // while 가독성 문제
        while (payment >= COST) {
            payment -= COST;
            this.list.add(new LottoTicket());
        }
        return this.list;
    }


}
