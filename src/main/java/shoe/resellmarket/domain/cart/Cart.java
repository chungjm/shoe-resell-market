package shoe.resellmarket.domain.cart;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
public class Cart {

    @Id @GeneratedValue
    @Column(name = "cart_id")
    private Long id;

    @OneToMany(mappedBy = "cart", orphanRemoval = true)
    private Set<CartProduct> wishList = new HashSet<>();

    public void addCartProduct(CartProduct cartProduct) {
        wishList.add(cartProduct);
    }
}
