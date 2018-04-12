package net.abcbook.learn.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author summer
 * @date 2018/4/12 下午5:28
 */
@Component
public class RandomValue {
    @Value("${author.property.value}")
    private String value;
    @Value("${author.property.number}")
    private Integer number;
    @Value("${author.property.bignumber}")
    private Long bignumber;
    @Value("${author.property.number1}")
    private Integer number1;
    @Value("${author.property.number2}")
    private Integer number2;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }
}
