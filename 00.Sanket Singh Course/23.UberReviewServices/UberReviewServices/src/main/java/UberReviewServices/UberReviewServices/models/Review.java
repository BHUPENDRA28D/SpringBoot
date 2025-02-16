package UberReviewServices.UberReviewServices.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.function.DoubleToLongFunction;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_review")
@Inheritance(strategy = InheritanceType.JOINED)  //SINGLE_TABLE | TABLE_PER_CLASS |
public class Review extends BaseModel {



 @Column(nullable = false)
 private String content;

 private Double rating;



 @Override
 public String toString() {
  return "Review: " + this.content + " " + this.rating + " " +  " " + this.createdAt;
 }

}
