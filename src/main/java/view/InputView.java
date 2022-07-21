package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int purchase() throws IOException {
        System.out.println("구입 금액을 입력해주세요.");
        int cost = 0;
        try {
            cost = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
        }
        return cost;
    }



}
