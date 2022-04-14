package shoe.resellmarket.domain.address;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class AddressBook {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addressList = new ArrayList<>();

    public void addAddress(Address address) {
        addressList.add(address);
    }

    public void deleteAddress(Address address) {
        addressList.remove(address);
    }
}
