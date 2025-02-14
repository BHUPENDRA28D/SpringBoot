package UberReviewServices.UberReviewServices.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
public abstract class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;


    // @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // this annotation tells spring about the formats of Date object to be stored ie.Date/Time/Timestamp.
    @CreatedDate //this annotation tells spring that only handle ir for object cration
    protected Date createdAt;

    // @Column(nullable = false)
    @Temporal(TemporalType.DATE) // this annotation tells spring about the formats of Date object to be stored ie.Date/Time/Timestamp.
    @LastModifiedDate //this annotation tells spring that only handles it object update.
    protected Date updatedAt;
}
