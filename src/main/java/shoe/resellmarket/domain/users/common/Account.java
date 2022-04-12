package shoe.resellmarket.domain.users.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

/**
 * 예금주, 은행 이름, 계좌 번호
 */
@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Account {

    private String depositor;
    private String bankName;
    private String accountNumber;
}
