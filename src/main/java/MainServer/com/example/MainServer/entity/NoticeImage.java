package MainServer.com.example.MainServer.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "notice_images")
public class NoticeImage {

    @Id @GeneratedValue
    private String id;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "notice_id")
    private String noticeId;

}
