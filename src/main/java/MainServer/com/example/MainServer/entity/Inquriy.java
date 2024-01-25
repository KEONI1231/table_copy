package MainServer.com.example.MainServer.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Getter
@Table(name = "inquiries")
public class Inquriy {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "bike_id")
    private Long bikeId;
    private String content;
    @Column(name = "upload_date")
    private LocalDate uploadDate;  //yyyy-MM-dd
    private int process;
    private String solution;
}
