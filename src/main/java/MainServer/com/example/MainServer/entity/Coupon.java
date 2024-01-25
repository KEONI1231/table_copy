package MainServer.com.example.MainServer.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table(name = "coupons")
@Getter
public class Coupon {
    @Id @GeneratedValue
    private UUID id;

    private boolean available;
    @Column(name="coupon_name")
    private String couponName;
    @Column(name="coupon_type")
    private int couponType;
    @Column(name="discount_rate")
    private int discountRate;
    @Column(name="expiry_date")
    private int expiryDate;

}
