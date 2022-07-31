package view;

import domain.AutoLotto;
import domain.LottoPolicy;
import domain.LottoNumber;
import domain.LottoPolicy;
import domain.WinningNumber;
import exception.LackCostException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class InputView {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final String LOTTO_NUMBERS_SIZE_EXCEPTION_MSG = "6개의 숫자를 입력하세요.";

    public static long payment() throws IOException {
        System.out.println("구입 금액을 입력해주세요.");
        long cost = Integer.parseInt(br.readLine());
        return cost;
    }

    public static WinningNumber drawing() throws IOException {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, ", ");
        List<LottoNumber> list = new ArrayList<>();

        if (st.countTokens() != LottoPolicy.LOTTO_NUMBERS_SIZE) {
            throw new IllegalArgumentException(LOTTO_NUMBERS_SIZE_EXCEPTION_MSG);
        }
        int[] arr = new int[LottoPolicy.LOTTO_NUMBERS_SIZE];
        for (int i = 0; i < LottoPolicy.LOTTO_NUMBERS_SIZE; i++) {
            list.add(new LottoNumber(Integer.parseInt(st.nextToken())));
        }
        WinningNumber winningNumber = new WinningNumber(list);
        return new WinningNumber(list);
    }
}
