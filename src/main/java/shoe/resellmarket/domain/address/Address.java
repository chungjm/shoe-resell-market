package shoe.resellmarket.domain.address;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Address {

    @Id @GeneratedValue
    private Long id;
    private String addressName;
    private String roadNameAddress;
    private String detailedAddress;
    private String postalCode;

    public void updateAddress(String addressName, String roadNameAddress, String detailedAddress, String postalCode) {
        this.addressName = addressName;
        this.roadNameAddress = roadNameAddress;
        this.detailedAddress = detailedAddress;
        this.postalCode = postalCode;
    }

    @Builder
    public Address(String addressName, String roadNameAddress, String detailedAddress, String postalCode) {
        this.addressName = addressName;
        this.roadNameAddress = roadNameAddress;
        this.detailedAddress = detailedAddress;
        this.postalCode = postalCode;
    }
}
