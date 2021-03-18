package kr.pe.skycows.springboot.web;

import kr.pe.skycows.springboot.web.dto.HelloResponseDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {

    @Test
    public void 롬복기능_테스트() throws Exception{
        String name = "skycows";
        int amount = 10000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        Assertions.assertEquals(name, dto.getName());
        Assertions.assertEquals(amount, dto.getAmount());


    }

}
