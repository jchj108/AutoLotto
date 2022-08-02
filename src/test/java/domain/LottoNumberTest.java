package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class LottoNumberTest {

    @Test
    @DisplayName("로또 번호를 생성한다")
    void createLottoNumberTest() {
        //Given
        int randomInt = 5;
        LottoNumber lottoNumber = new LottoNumber(randomInt);
        //When
        //Then
        assertThat(lottoNumber.getNumber()).isEqualTo(randomInt);
    }

    @DisplayName("범위를 벗어나는 값을 입력하면 Exception을 던진다")
    @ParameterizedTest(name = "{displayName} ==> notValidInput : {0}")
    @ValueSource(ints = {-1, 0, 46})
    void throw_exception_when_out_of_range(int notValidInput) {
        //Given+When+Then
        assertThatThrownBy(() -> new LottoNumber(notValidInput))
                .isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    @DisplayName("equals 오버라이딩을 테스트한다")
    void testEquals() {
        LottoNumber lottoNumber1 = new LottoNumber(1);
        LottoNumber lottoNumber2 = new LottoNumber(1);

        assertEquals(lottoNumber1, lottoNumber2);
    }
}