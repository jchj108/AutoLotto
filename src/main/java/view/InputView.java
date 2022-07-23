package view;

import exception.LackMoney;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
}
