package domain;

import java.util.ArrayList;
import java.util.List;

public class WinningResult {
    public List<LottoRank> winningCount = new ArrayList<>();

    public WinningResult(List<LottoTicket> lottoTickets, WinningNumber winningNumber) {
        for (LottoTicket lottoTicket : lottoTickets) {
            int cnt = 0;
            for (LottoNumber number : winningNumber.winningNumbers) {
                if (lottoTicket.lottoNumbers.contains(number)) {
                    cnt++;
                }
            }
            this.winningCount.add(LottoRank.valueOf(cnt));
        }
    }

}
