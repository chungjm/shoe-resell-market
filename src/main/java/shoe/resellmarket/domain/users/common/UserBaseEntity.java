package shoe.resellmarket.domain.users.common;

import lombok.Getter;
import shoe.resellmarket.domain.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public abstract class UserBaseEntity extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @Column(unique = true)
    protected String email;

    protected String password;

    @Enumerated(EnumType.STRING)
    protected UserLevel userLevel;
}
