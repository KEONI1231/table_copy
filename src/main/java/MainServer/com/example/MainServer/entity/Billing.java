package MainServer.com.example.MainServer.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "billings")
public class Billing {
    @Id @GeneratedValue
    private Long id;

    @Column(name = "usage_history_id")
    private Long usageHistoryId;
    private int amount;

    @Column(name = "apply_num")
    private String applyNum;

    @Column(name = "cancel_amount")
    private int cancelAmount;

    @Column(name = "cancel_reason")
    private String cancelReason;

    @Column(name = "cancelled_at")
    private Long cancelledAt;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "cash_receipt_issued")
    private boolean cashReceiptIssued;

    private String channel;
    private String currency;

    @Column(name = "custom_data")
    private String customData;

    @Column(name = "customer_uid")
    private String customerUid;

    @Column(name = "customer_uid_usage")
    private String customerUidUsage;

    @Column(name = "emb_pg_provide")
    private String embPgProvide;
    private boolean escrow;

    @Column(name = "fail_reason")
    private String failReason;

    @Column(name = "failed_at")
    private Long failedAt;

    @Column(name = "imp_uid")
    private String impUid;

    @Column(name = "merchant_uid")
    private String merchantUid;
    private String name;

    @Column(name = "paid_at")
    private Long paidAt;

    @Column(name = "pay_method")
    private String payMethod;

    @Column(name = "pg_id")
    private String pgId;

    @Column(name = "pg_provider")
    private String pgProvider;

    @Column(name = "pg_tid")
    private String pgTid;

    @Column(name = "receipt_url")
    private String receiptUrl;

    @Column(name = "started_at")
    private Long startedAt;
    private String status;

    @Column(name = "user_agent")
    private String userAgent;

    @Column(name = "coupon_use")
    private String couponUse;

    @Column(name = "point_use")
    private int pointUse;

    @Column(name = "penalty_fee")
    private int penaltyFee;
}
