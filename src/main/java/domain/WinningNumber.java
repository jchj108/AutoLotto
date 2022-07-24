package domain;

import java.util.ArrayList;
import java.util.List;

public class WinningNumber {

    public List<Integer> winningNumbers = new ArrayList<>();

    public WinningNumber(List<Integer> winningNumbers) {
        for (int i = 0; i < winningNumbers.size(); i++) {
            this.winningNumbers.add(winningNumbers.get(i));
        }
    }
}
