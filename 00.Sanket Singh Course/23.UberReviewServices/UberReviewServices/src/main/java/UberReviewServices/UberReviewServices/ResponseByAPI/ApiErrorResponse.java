package UberReviewServices.UberReviewServices.ResponseByAPI;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ApiErrorResponse {


    private int code;
    private String message;

//    public ApiErrorResponse(int code, String message) {
//        this.code = code;
//        this.message = message;
//    }


}