package shoe.resellmarket.domain.point;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shoe.resellmarket.domain.BaseTimeEntity;
import shoe.resellmarket.domain.users.user.User;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Point extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "point_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private PointClassification pointDivision;

    private Long amount;

    @Builder
    public Point(User user, Long amount, PointClassification pointDivision) {
        this.user = user;
        this.amount = amount;
        this.pointDivision = pointDivision;
    }
}
