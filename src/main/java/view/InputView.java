package view;

import domain.WinningNumber;
import exception.LackMoney;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class InputView {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int payment() throws IOException {
        System.out.println("구입 금액을 입력해주세요.");
        int cost = 0;
        try {
            cost = Integer.parseInt(br.readLine());

            if (cost < 1000) {
                throw new LackMoney("금액이 부족합니다.");
            }

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
        return cost;
    }

    public static WinningNumber drawing() throws IOException {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(",");
        int[] arr = new int[6];
        List<Integer> list = new ArrayList<>();

        try {
            if (st.countTokens() != 6) {
                throw new IllegalArgumentException("여섯 개의 숫자를 입력하세요.");
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for (int i : arr) {
                list.add(i);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
        return new WinningNumber(list);
    }
}
