package fooddelivery.domain;

import fooddelivery.domain.OrderCreated;
import fooddelivery.domain.OrderPlaced;
import fooddelivery.domain.OrderRejected;
import fooddelivery.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String customerName;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        OrderCreated orderCreated = new OrderCreated(this);
        orderCreated.publishAfterCommit();



        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

    }
    @PostRemove
    public void onPostRemove(){


        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }




    public static void approve(StockDecreased stockDecreased){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        OrderPlaced orderPlaced = new OrderPlaced(order);
        orderPlaced.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(stockDecreased.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);

            OrderPlaced orderPlaced = new OrderPlaced(order);
            orderPlaced.publishAfterCommit();

         });
        */

        
    }
    public static void reject(DeliveryFailed deliveryFailed){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        OrderRejected orderRejected = new OrderRejected(order);
        orderRejected.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryFailed.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);

            OrderRejected orderRejected = new OrderRejected(order);
            orderRejected.publishAfterCommit();

         });
        */

        
    }
    public static void reject(StockDecreaseFailed stockDecreaseFailed){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        OrderRejected orderRejected = new OrderRejected(order);
        orderRejected.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(stockDecreaseFailed.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);

            OrderRejected orderRejected = new OrderRejected(order);
            orderRejected.publishAfterCommit();

         });
        */

        
    }


}
