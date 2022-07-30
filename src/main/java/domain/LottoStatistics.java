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
            switch (lottoRank.countOfMatch) {
                case 3 :
                    lottoWinStatistics.put(3, lottoWinStatistics.get(3) + 1);
                    this.sumPrize += LottoRank.FOURTH.prize;
                    break;
                case 4 :
                    lottoWinStatistics.put(4, lottoWinStatistics.get(4) + 1);
                    this.sumPrize += LottoRank.THIRD.prize;
                    break;
                case 5 :
                    lottoWinStatistics.put(5, lottoWinStatistics.get(5) + 1);
                    this.sumPrize += LottoRank.SECOND.prize;
                    break;
                case 6 :
                    lottoWinStatistics.put(6, lottoWinStatistics.get(6) + 1);
                    this.sumPrize += LottoRank.FIRST.prize;
                    break;
            }
        }
    }

    private void init() {
        this.lottoWinStatistics.put(3, 0);
        this.lottoWinStatistics.put(4, 0);
        this.lottoWinStatistics.put(5, 0);
        this.lottoWinStatistics.put(6, 0);
    }
}
