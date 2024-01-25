package MainServer.com.example.MainServer.entity;

import MainServer.com.example.MainServer.entity.enumdata.UserRole;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
public class User {
    @Id @GeneratedValue
    private Long id;

    @Column(name = "imp_uid")
    private String impUid;

    @Column(name = "merchant_uid")
    private String merchantUid;

    private LocalDate birthday;

    private String name;
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "refresh_number")
    private String refreshToken;

    private UserRole role;
    @Column(name = "fcm_token")
    private String fcmToken;

    @Column(name = "total_charge")
    private int totalCharge;

    @Column(name = "total_distance")
    private int totalDistance;

    @Column(name = "total_usage")
    private int totalUsage;

    @Column(name = "marketing_allow")
    private boolean marketingAllow;
    @Column(name = "marketing_allow_date")
    private LocalDateTime marketingAllowDate;
    private String carrier;

    private int gender;

    private int point;
    @Column(name = "un_encoded_phone_number")
    private String unEncodedPhoneNumber;


    //private MemberCoupon memberCoupon;

    public User() {}
}
