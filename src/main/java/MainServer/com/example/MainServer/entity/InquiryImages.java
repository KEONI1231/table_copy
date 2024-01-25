package MainServer.com.example.MainServer.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "inquiry_images")
public class InquiryImages {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "inquiry_id")
    private Long inquiry_id;

    @Column(name = "img_url")
    private String img_url;
}
