package UberReviewServices.UberReviewServices.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.function.DoubleToLongFunction;

@Entity
@Table(name = "booking_review")
public class Review {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 Long id;

@Column(nullable = false)
 String content;

 Double rating ;

 @Column(nullable = false)
 @Temporal(TemporalType.TIMESTAMP) // this annotation tells spring about the formats of Date object to be stored ie.Date/Time/Timestamp.
 @CreatedDate //this annotation tells spring that only handle ir for object cration
  Date createdAt;

 @Column(nullable = false)
 @Temporal(TemporalType.TIMESTAMP) // this annotation tells spring about the formats of Date object to be stored ie.Date/Time/Timestamp.
 @LastModifiedDate //this annotation tells spring that only handles it object update.
 Date updatedAt;
}
