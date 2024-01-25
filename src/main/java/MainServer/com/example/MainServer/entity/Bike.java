package MainServer.com.example.MainServer.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "bikes")
public class Bike {
    @Id
    @GeneratedValue
    private String id; //기체 고유값
    // is_parking_area boolean
    private boolean status;
    @Column(name = "store_id")
    private String storeId;
    @Column(name = "total_distance")
    private int totalDistance;
    @Column(name = "total_usage")
    private int totalUsage;
    @Column(name = "total_income")
    private int totalIncome;
    @Column(name = "is_rental")
    private boolean isRental;
    @Column(name = "day_time_start_fee")
    private int dayTimeStartFee;
    @Column(name = "night_time_start_fee")
    private int nightTimeStartFee;
    @Column(name = "day_time_per_minute_fee")//해제 요금
    private int dayTimePerMinuteFee;
    @Column(name = "night_time_per_minute_fee")// 분당 요금
    private int nightTimePerMinuteFee;
    @Column(name = "penalty_fee")
    private int penaltyFee;
}
