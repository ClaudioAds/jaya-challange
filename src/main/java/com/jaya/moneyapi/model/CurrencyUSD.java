package com.jaya.moneyapi.model;

import com.jaya.moneyapi.dto.response.ws.WSRatesDtoResponse;

import java.math.BigDecimal;

public class CurrencyUSD implements Currency{

    @Override
    public BigDecimal getEuroExchangeRate(WSRatesDtoResponse wsRatesDtoResponse) {
        return BigDecimal.valueOf(wsRatesDtoResponse.getUSD());
    }
}