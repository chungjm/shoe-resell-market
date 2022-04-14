package shoe.resellmarket.domain.trade;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shoe.resellmarket.domain.BaseTimeEntity;
import shoe.resellmarket.domain.product.Product;
import shoe.resellmarket.domain.users.user.User;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Trade extends BaseTimeEntity {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private User publisher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id")
    private User seller;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id")
    private User buyer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Enumerated(EnumType.STRING)
    private TradeStatus status;

    private Long price;

    private double productSize;


}
