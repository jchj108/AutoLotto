package view;

import domain.AutoLotto;
import domain.Constant;
import domain.LottoNumbers;
import domain.WinningNumber;
import exception.LackCostException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class InputView {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int payment() throws IOException {
        System.out.println("구입 금액을 입력해주세요.");
        int cost = Integer.parseInt(br.readLine());
        return cost;
    }

    public static WinningNumber drawing() throws IOException {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, ", ");
        List<LottoNumbers> list = new ArrayList<>();

        int[] arr = new int[Constant.LOTTO_NUMBER_SIZE];

        for (int i = 0; i < Constant.LOTTO_NUMBER_SIZE; i++) {
            list.add(new LottoNumbers(Integer.parseInt(st.nextToken())));
        }

        WinningNumber winningNumber = new WinningNumber(list);

        return new WinningNumber(list);
    }
}
