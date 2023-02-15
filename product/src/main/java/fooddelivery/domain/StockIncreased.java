package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImage;
    private Integer stock;
    private String orderId;
    private String productId;

    public StockIncreased(Inventory aggregate){
        super(aggregate);
    }
    public StockIncreased(){
        super();
    }
}
