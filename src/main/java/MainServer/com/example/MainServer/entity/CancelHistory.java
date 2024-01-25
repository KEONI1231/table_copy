package MainServer.com.example.MainServer.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "cancel_histories")
public class CancelHistory {
    @Id
    @GeneratedValue
    private Long id;
    private int amount;

    @Column(name = "cancelled_at")
    private int cancelledAt;
    @Column(name = "pg_tid")
    private String pgTid;
    private String reason;
    @Column(name = "receipt_url")
    private String receiptUrl;
}
