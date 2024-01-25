package MainServer.com.example.MainServer.entity;


import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Getter
@Table(name = "private_land_user")
public class PrivateLandUser
{
    @Id @GeneratedValue
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User id;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    private String address;
    private LocalDate authorizationDate;
    private boolean isAuthorized;

}
