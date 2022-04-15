package shoe.resellmarket.domain.brand;

import lombok.*;
import shoe.resellmarket.domain.BaseTimeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Brand extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "brand_id")
    private Long id;

    @Column(unique = true)
    private String nameKor;

    @Column(unique = true)
    private String nameEng;

    private String originImagePath;

    private String thumbnailImagePath;
}
