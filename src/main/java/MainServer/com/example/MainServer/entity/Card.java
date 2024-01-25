package MainServer.com.example.MainServer.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "cards")
public class Card {
    @Id @GeneratedValue
    private String billingKey;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "user_id")
    private User user;

    private String cardName;

    private boolean capital;
}
