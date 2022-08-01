package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class LottoNumberTest {

    @Test
    void 로또_번호_객체_생성() {
        //Given
        int randomInt = 5;
        LottoNumber lottoNumber = new LottoNumber(randomInt);
        //When
        //Then
        assertThat(lottoNumber.getNumber()).isEqualTo(randomInt);
    }

    @Test
    void getNumber() {
    }

    @Test
    void setNumber() {
    }

    @Test
    void compareTo() {
    }

    @Test
    void testToString() {
    }

    @Test
    void testEquals() {
    }
}