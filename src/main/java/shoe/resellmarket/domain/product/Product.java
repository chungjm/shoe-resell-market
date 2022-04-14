package shoe.resellmarket.domain.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shoe.resellmarket.domain.BaseTimeEntity;
import shoe.resellmarket.domain.product.common.Currency;
import shoe.resellmarket.domain.product.common.SizeClassification;
import shoe.resellmarket.domain.product.common.SizeUnit;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private Long id;

    private String name;

    @Column(unique = true)
    private String modelNumber;

    private String color;

    private LocalDate releaseDate;

    private int releasePrice;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Enumerated(EnumType.STRING)
    private SizeClassification sizeClassification;

    @Enumerated(EnumType.STRING)
    private SizeUnit sizeUnit;

    private double minSize;

    private double maxSize;

    private double sizeGap;

    private String originImagePath;

    private String thumbnailImagePath;

    private String resizedImagePath;





}
