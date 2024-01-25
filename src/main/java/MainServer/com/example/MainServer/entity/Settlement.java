package MainServer.com.example.MainServer.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Getter
@Table(name = "settlement")
public class Settlement {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "store_id")
    private String storeId;
    @Column(name = "settlement_date")
    private LocalDate settlementDate; //yyyy-MM-dd
    @Column(name = "total_income")
    private int totalIncome;
    @Column(name = "total_settlement")
    private int totalSettlement;
    @Column(name = "total_usage")
    private int totalUsage;
    @Column(name = "start_date")
    private LocalDate startDate; //yyyy-MM-dd
    @Column(name = "end_date")
    private LocalDate endDate;//yyyy-MM-dd
}
