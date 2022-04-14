package shoe.resellmarket.domain.trade;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shoe.resellmarket.domain.BaseTimeEntity;
import shoe.resellmarket.domain.address.Address;
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "return_id")
    private Address shippingAddress;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipping_id")
    private Address returnAddress;

    private String receivingTrackingNumber;

    private String forwardingTrackingNumber;

    private String returnTrackingNumber;

    private String cancelReason;

    @Builder
    public Trade(Long id, User publisher, User seller, User buyer,
                 Product product, TradeStatus status, Long price, double productSize,
                 Address shippingAddress, Address returnAddress) {
        this.id = id;
        this.publisher = publisher;
        this.seller = seller;
        this.buyer = buyer;
        this.product = product;
        this.status = status;
        this.price = price;
        this.productSize = productSize;
        this.shippingAddress = shippingAddress;
        this.returnAddress = returnAddress;
    }
}
