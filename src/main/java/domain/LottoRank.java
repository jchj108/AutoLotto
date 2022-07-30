package domain;

public enum LottoRank {

    FIRST(6, 2_000_000_000),
    SECOND(5, 30_000_000),
    THIRD(4, 50_000),
    FOURTH(3, 5_000),
    LOSE(0, 0);

    public final int countOfMatch;
    public final long prize;
    LottoRank(int countOfMatch, int prize) {
        this.countOfMatch = countOfMatch;
        this.prize = prize;
    }

    public static LottoRank valueOf(int cnt) {
        LottoRank[] values = LottoRank.values();

        for (LottoRank lottoRank : values) {
            if (lottoRank.countOfMatch == cnt) {
                return lottoRank;
            }
        }
        return LOSE;
    }
}
