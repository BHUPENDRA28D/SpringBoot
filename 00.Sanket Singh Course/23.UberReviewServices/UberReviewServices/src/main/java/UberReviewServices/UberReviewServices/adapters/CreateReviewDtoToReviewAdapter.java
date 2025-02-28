package UberReviewServices.UberReviewServices.adapters;

import UberReviewServices.UberReviewServices.dtos.CreateReviewDto;
import UberReviewServices.UberReviewServices.models.Review;

public interface CreateReviewDtoToReviewAdapter {

    public Review convertDto(CreateReviewDto createReviewDto);
}
