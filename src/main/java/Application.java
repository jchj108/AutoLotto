import domain.*;
import view.InputView;
import view.ResultView;

import java.io.IOException;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {
        long payment = InputView.payment();
        List<LottoTicket> lottoTickets = new AutoLotto().getTicket(payment);
        ResultView.printPayment(lottoTickets);

        WinningNumber winningNumber = InputView.drawing();
        WinningResult winningResult = new WinningResult(lottoTickets, winningNumber);
        LottoStatistics statistics = new LottoStatistics(winningResult);

        ResultView.printResult(winningNumber, statistics);

    }
}
