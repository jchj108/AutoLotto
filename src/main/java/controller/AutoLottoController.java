package controller;

import domain.AutoLotto;
import domain.LottoTicket;
import domain.WinningNumber;
import domain.WinningResult;
import view.InputView;
import view.Resultview;

import java.io.IOException;
import java.util.List;

public class AutoLottoController {
    public static void main(String[] args) throws IOException {
        long payment = InputView.payment();
        List<LottoTicket> lottoTickets = new AutoLotto().getTicket(payment);
        Resultview.printPayment(lottoTickets);

        WinningNumber winningNumber = InputView.drawing();
        WinningResult winningResult = new WinningResult(lottoTickets, winningNumber);

        Resultview.printResult(lottoTickets, winningNumber);

    }
}
