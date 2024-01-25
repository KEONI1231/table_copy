package MainServer.com.example.MainServer.entity;

import MainServer.com.example.MainServer.entity.enumdata.SubcaseSelectEnum;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "inquiry_subcases")
public class InquirySubcase {
    @Id @GeneratedValue
    private Long id;

    @Column(name = "inquiry_id")
    private Long inquiryId;

    @Column(name = "subcase_select")
    private SubcaseSelectEnum subcaseSelect;
}
