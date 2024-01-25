package MainServer.com.example.MainServer.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Fetch;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Table(name = "member_coupons")
public class MemberCoupon
{
    @Id @GeneratedValue
    private Long id; // 타입을 Long으로 수정

    @ManyToOne
    //@Column(name = "user_id")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    @Column(name = "issued_date")
    private LocalDate issuedDate; // 발급 날짜 추가

    private boolean used; // 사용 여부 추가

}
