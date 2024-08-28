package live.greenmarket.greenmarket.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String nickname;
    private double score;
    private boolean isActive;
    private Date createDate;
    private Date updateDate;

    // enum private Grade grade;
    // enum private Role role;


}
