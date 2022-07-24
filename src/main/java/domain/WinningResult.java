package domain;

import java.util.ArrayList;
import java.util.List;

public class WinningResult {

    public List<Integer> winningCount = new ArrayList<>();

    public WinningResult(WinningNumber winningNumber, List<LottoTicket> lottoTickets) {

        for (LottoTicket lottoTicket : lottoTickets) {
            int cnt = 0;
            for (Integer number : winningNumber.winningNumbers) {
                if (lottoTicket.lottoNumbers.contains(winningNumber)) {
                    cnt++;
                }
            }
            this.winningCount.add(cnt);
        }
    }
}
