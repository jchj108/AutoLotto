package view;

import domain.*;

import java.util.List;

public class Resultview {

    public static void printPayment(List<LottoTicket> lottoTickets) {

        System.out.println(lottoTickets.size() + "개를 구매했습니다.");
        for (LottoTicket lottoTicket : lottoTickets) {
            System.out.println(lottoTicket.lottoNumbers.toString());
        }
    }

    public static void printResult(WinningNumber winningNumber, LottoStatistics lottoStatistics) {
        System.out.println(winningNumber.winningNumbers);
        System.out.println("당첨 통계");
        System.out.println("--------");
        System.out.println("3개 일치 (" + LottoRank.FOURTH.prize + "원) - " + lottoStatistics.lottoWinStatistics.get(3));
        System.out.println("4개 일치 (" + LottoRank.THIRD.prize + "원) - " + lottoStatistics.lottoWinStatistics.get(4));
        System.out.println("5개 일치 (" + LottoRank.SECOND.prize + "원) - " + lottoStatistics.lottoWinStatistics.get(5));
        System.out.println("6개 일치 (" + LottoRank.FIRST.prize + "원) - " + lottoStatistics.lottoWinStatistics.get(6));
        System.out.println("총 수익률은 " + lottoStatistics.yield + " 입니다." + lottoStatistics.benefit);

    }
}
