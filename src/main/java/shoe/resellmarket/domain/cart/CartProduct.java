package shoe.resellmarket.domain.cart;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shoe.resellmarket.domain.product.Product;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CartProduct {

    @Id
    @GeneratedValue
    @Column(name = "cart_product_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Builder
    public CartProduct(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    public Long getProductId() {
        return product.getId();
    }
}
