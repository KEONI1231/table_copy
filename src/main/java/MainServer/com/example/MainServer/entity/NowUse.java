package MainServer.com.example.MainServer.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Table(name = "now_uses")
@Getter
public class NowUse {

    @Id
    @GeneratedValue
    private Long id; // X
    @Column(name = "bike_id")
    private Long bikeId;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "start_longtitude")
    private String startLongtitude;
    @Column(name = "start_latitude")
    private String startLatitude;
    @Column(name = "start_time")
    private LocalDateTime startTime;
    @Column(name = "now_pausing")
    private boolean nowPausing;
}
