package MainServer.com.example.MainServer.entity;


import MainServer.com.example.MainServer.entity.enumdata.StoreEnum;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "stores")
public class Store {
    @Id @GeneratedValue
    private Long id;
    private LocalDate birth;  //yyyy-MM-dd
    private String email;
    private String location;
    @Column(name = "login_id")
    private String loginId;
    private String name;
    private String password;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "refresh_token")
    private String refreshToken;
    private StoreEnum role;
    @Column(name = "start_date")
    private LocalDate startDate;  //yyyy-MM-dd
    @Column(name = "fcm_token")
    private String fcmToken;
    @Column(name = "marketing_allow")
    private boolean marketingAllow;
    @Column(name = "marketing_allow_date")
    private LocalDateTime marketingAllowDate;
    @Column(name = "settlement_rate")
    private int settlementRate; //정산비율
    private String region;
}
