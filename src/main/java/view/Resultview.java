package view;

import domain.AutoLotto;
import domain.LottoTicket;
import domain.WinningNumber;

import java.util.List;

public class Resultview {

    public static void printPayment(List<LottoTicket> lottoTickets) {

        System.out.println(lottoTickets.size() + "개를 구매했습니다.");
        for (LottoTicket lottoTicket : lottoTickets) {
            System.out.println(lottoTicket.toString());
        }
    }

    public static void printResult(List<LottoTicket> lottoTickets, WinningNumber winningNumber) {

        System.out.println("당첨 통계");
        System.out.println("--------");

    }
}
