package live.greenmarket.greenmarket.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;
    private String description;
    private boolean isNegotiate;
    private boolean isActive;
    private String image;
    private String tradeStyle;
//    private Trade trade;
//    private Category category;
}
