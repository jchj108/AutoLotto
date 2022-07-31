package domain;

import view.InputView;

import java.util.HashMap;
import java.util.Map;

public class LottoStatistics {
    public Map<Integer, Integer> lottoWinStatistics = new HashMap<>();
    public double yield;
    private double sumCost;
    private double sumPrize;
    public String benefit;
    public LottoStatistics(WinningResult winningResult) {
        init();
        setLottoWinStatistics(winningResult);
        calcYield();
    }

    private void calcYield() {
        this.yield = this.sumPrize / this.sumCost;
        if (this.yield > 1) {
            benefit = "기준이 1이기 때문에 결과적으로 이득이라는 의미임";
        } else {
            benefit = "기준이 1이기 때문에 결과적으로 손해라는 의미임";
        }
    }

    private void setLottoWinStatistics(WinningResult winningResult) {
        for (LottoRank lottoRank : winningResult.winningCount) {
            this.sumCost += LottoPolicy.COST;
            this.sumPrize += lottoRank.prize;
            lottoWinStatistics.put(lottoRank.countOfMatch, lottoWinStatistics.get(lottoRank.countOfMatch) + 1);
        }
    }

    private void init() {
        for (int i = 0; i <= LottoPolicy.LOTTO_NUMBERS_SIZE; i++) {
            this.lottoWinStatistics.put(i, 0);
        }
    }
}
