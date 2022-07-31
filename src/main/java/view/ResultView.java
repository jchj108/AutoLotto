package view;

import domain.*;

import java.util.List;

public class ResultView {
    public static void printPayment(List<LottoTicket> lottoTickets) {
        System.out.println(lottoTickets.size() + "개를 구매했습니다.");
        for (LottoTicket lottoTicket : lottoTickets) {
            System.out.println(lottoTicket.autoLottoNumbers.toString());
        }
    }

    public static void printResult(WinningNumber winningNumber, LottoStatistics lottoStatistics) {
        System.out.println(winningNumber.winningNumbers);
        System.out.println("당첨 통계");
        System.out.println("--------");
        System.out.println(LottoRank.FOURTH.countOfMatch + "개 일치 (" + LottoRank.FOURTH.prize + "원) - " + lottoStatistics.lottoWinStatistics.get(LottoRank.FOURTH.countOfMatch));
        System.out.println(LottoRank.THIRD.countOfMatch + "개 일치 (" + LottoRank.THIRD.prize + "원) - " + lottoStatistics.lottoWinStatistics.get(LottoRank.THIRD.countOfMatch));
        System.out.println(LottoRank.SECOND.countOfMatch + "개 일치 (" + LottoRank.SECOND.prize + "원) - " + lottoStatistics.lottoWinStatistics.get(LottoRank.SECOND.countOfMatch));
        System.out.println(LottoRank.FIRST.countOfMatch + "개 일치 (" + LottoRank.FIRST.prize + "원) - " + lottoStatistics.lottoWinStatistics.get(LottoRank.FIRST.countOfMatch));
        System.out.println("총 수익률은 " + lottoStatistics.yield + " 입니다. " + lottoStatistics.benefit);

    }
}
