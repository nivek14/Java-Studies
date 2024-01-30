package com.example.demo.domain.product;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

// o certo seria isso ser um record ao invés de uma classe
public class RequestProduct {

    public String id;

    @NotBlank
    public String name;

    @NotNull
    public Integer price_in_cents;

}
