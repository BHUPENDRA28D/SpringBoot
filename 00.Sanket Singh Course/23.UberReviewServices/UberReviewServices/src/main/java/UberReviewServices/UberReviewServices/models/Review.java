package UberReviewServices.UberReviewServices.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.function.DoubleToLongFunction;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "booking_review")
public class Review {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

@Column(nullable = false)
private String content;

 Double rating ;

// @Column(nullable = false)
 @Temporal(TemporalType.TIMESTAMP) // this annotation tells spring about the formats of Date object to be stored ie.Date/Time/Timestamp.
 @CreatedDate //this annotation tells spring that only handle ir for object cration
 private Date createdAt;

// @Column(nullable = false)
 @Temporal(TemporalType.DATE) // this annotation tells spring about the formats of Date object to be stored ie.Date/Time/Timestamp.
 @LastModifiedDate //this annotation tells spring that only handles it object update.
 private Date updatedAt;

 public String toString(){
  return "Review : "+this.content+ " "+ this.rating+ " ";
 }
}
