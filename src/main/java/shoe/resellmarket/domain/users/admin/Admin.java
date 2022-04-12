package shoe.resellmarket.domain.users.admin;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import shoe.resellmarket.domain.users.common.UserBaseEntity;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Admin extends UserBaseEntity {

}
