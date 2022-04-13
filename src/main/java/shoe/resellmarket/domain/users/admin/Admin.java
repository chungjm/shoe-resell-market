package shoe.resellmarket.domain.users.admin;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import shoe.resellmarket.domain.users.common.UserBaseEntity;
import shoe.resellmarket.domain.users.common.UserLevel;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Admin extends UserBaseEntity {

    @Builder
    public Admin(String email, String password, UserLevel userLevel) {
        this.email = email;
        this.password = password;
        this.userLevel = userLevel;
    }
}
