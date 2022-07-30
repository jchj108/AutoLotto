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

    public static void printResult(List<LottoTicket> lottoTickets, WinningNumber winningNumber) {

        System.out.println(winningNumber.winningNumbers);
        System.out.println("당첨 통계");
        System.out.println("--------");

        WinningResult winningResult = new WinningResult(lottoTickets, winningNumber);
        System.out.println("3개 일치 : " + winningResult.fourthPrize);
        System.out.println("4개 일치 : " + winningResult.thirdPrize);
        System.out.println("5개 일치 : " + winningResult.twicePrize);
        System.out.println("6개 일치 : " + winningResult.firstPrize);

        System.out.println("총 수익률은 " + CalcBenefit.benefit + "입니다.");
    }
}
