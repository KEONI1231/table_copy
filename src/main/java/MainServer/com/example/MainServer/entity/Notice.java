package MainServer.com.example.MainServer.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "notices")
public class Notice {

    @Id @GeneratedValue
    private Long id;

    private boolean is_show;
    private LocalDateTime update_time;//공지가 업데이트된 시간
    private String title;
    private String content;
}
