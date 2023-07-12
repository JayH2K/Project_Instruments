package io.codelex.project_instruments;

import java.math.BigDecimal;

public class InstrumentDto {

    private String name;

    private BigDecimal price;

    public InstrumentDto(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
