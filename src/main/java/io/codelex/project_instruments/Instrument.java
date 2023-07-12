package io.codelex.project_instruments;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Instrument {

    private String name;

    private BigDecimal price;

    private final LocalDateTime dateCreated;

    public Instrument(String name, BigDecimal price, LocalDateTime dateCreated) {
        this.name = name;
        this.price = price;
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
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
