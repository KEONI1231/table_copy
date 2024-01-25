package MainServer.com.example.MainServer.entity;


import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "usage_histories")
public class UsageHistory {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "login_id")
    private Long userId;

    @Column(name = "bike_id")
    private String bikeId;

    @Column(name = "start_longtitude")
    private String startLongtitude;

    @Column(name = "start_latitude")
    private String startLatitude;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_longitude")
    private String endLongitude;

    @Column(name = "end_latitude")
    private String endLatitude;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    private int fee;

    @Column(name = "is_paid")
    private boolean isPaid;

    @Column(name = "store_id")
    private Long storeId;

    @Column(name = "single_riding_mileage")
    private int singleRidingMileage;

    @Column(name = "return_picture")
    private String returnPicture;

    @Column(name = "force_lock")
    private boolean forceLock;

}
