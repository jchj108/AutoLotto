package domain;

import java.util.ArrayList;
import java.util.List;

public class WinningResult {
    public List<Integer> winningCount = new ArrayList<>();
    public int fourthPrize;
    public int thirdPrize;
    public int twicePrize;
    public int firstPrize;

    public WinningResult(List<LottoTicket> lottoTickets, WinningNumber winningNumber) {
        for (LottoTicket lottoTicket : lottoTickets) {
            int cnt = 0;
            for (LottoNumbers number : winningNumber.winningNumbers) {
                if (lottoTicket.lottoNumbers.contains(number)) {
                    cnt++;
                }
            }
            switch (cnt) {
                case 6 : firstPrize++; break;
                case 5 : twicePrize++; break;
                case 4 : thirdPrize++; break;
                case 3 : fourthPrize++; break;
            }
        }
    }
}
