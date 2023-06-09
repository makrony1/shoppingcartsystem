package edu.miu.shoppingcartsystem.repository;

import edu.miu.shoppingcartsystem.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    @Query("SELECT c FROM CartItem c WHERE c.order.orderId = :orderId")
    List<CartItem> findByOrderId(long orderId);

}
