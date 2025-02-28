package UberReviewServices.UberReviewServices.adapters;

import UberReviewServices.UberReviewServices.dtos.CreateReviewDto;
import UberReviewServices.UberReviewServices.models.Booking;
import UberReviewServices.UberReviewServices.models.Review;
import UberReviewServices.UberReviewServices.repositories.BookingRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.Optional;


@Component
public class CreateReviewDtoToReviewAdapterImpl implements CreateReviewDtoToReviewAdapter{

    @Autowired
    private BookingRepositry bookingRepositry;

//    public CreateReviewDtoToReviewAdapterImpl(BookingRepositry bookingRepositry){
//
//    }

    @Override
    public Review convertDto(CreateReviewDto createReviewDto) {
         Optional< Booking> booking = bookingRepositry.findById(createReviewDto.getBookingId());
         if(booking.isEmpty()){
             return null;
         }
         Review review = Review.builder()
                 .rating(createReviewDto.getRating())
                 .content(createReviewDto.getContent())
                 .booking(booking.get())
                 .build();
         return review;
    }
}
