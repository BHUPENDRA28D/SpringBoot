package com.dailycodeBuffer.spring_Security_client.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerificationToken {

    private static final int EXPIRATION_TIME =5;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  token;
    private Date expirationTime;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id",
             nullable = false,
             foreignKey =  @ForeignKey(name = "FK_USER_VERFIY_TOKEN"))
    private User user;

    public VerificationToken(User user,String Token){
        super();
        this.token =token;
        this.user =user;
        this.expirationTime =calculateExpirationDate(EXPIRATION_TIME);
    }

    public VerificationToken(String Token){
        super();
        this.token =token;
        this.expirationTime =calculateExpirationDate(EXPIRATION_TIME);
    }

    private Date calculateExpirationDate(int expirationTime) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime());
        calendar.add(calendar.MINUTE,expirationTime);

        return new Date(calendar.getTime().getTime());
    }
}
