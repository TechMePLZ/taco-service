package ru.friend.tacoservice.orders;

import lombok.Data;
import ru.friend.tacoservice.model.Pelemen;

import java.util.ArrayList;
import java.util.List;

@Data
public class PelemenOrders {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private List<Pelemen> pelemens = new ArrayList<>();

    /**
     * добавляем пелень в заказ
     * @param pelemen
     */
    public void addPelemen(Pelemen pelemen){
        this.pelemens.add(pelemen);
    }
}
