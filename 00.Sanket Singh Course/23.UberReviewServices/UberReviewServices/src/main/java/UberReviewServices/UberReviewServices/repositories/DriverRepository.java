package UberReviewServices.UberReviewServices.repositories;

import UberReviewServices.UberReviewServices.models.Booking;
import UberReviewServices.UberReviewServices.models.CustomDriver;
import UberReviewServices.UberReviewServices.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {

    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);

/*
    //Writing native  & raw quries
    @Query(nativeQuery = true,value = "SELECT * FROM  Driver WHERE id = :id AND license_number= :licenseNumber ")
    Optional<Driver> rawFindByIdAndLicenseNumber(Long id, String licenseNumber);



//    //Writing hibernate   quries
//    @Query("SELECT d FROM  Driver as d WHERE d.id = :id AND d.licenseNumber= :ln")
//    Optional<Driver> hqlFindByIdAndLicense(Long id, String ln);

    //Writing hibernate   quries
    @Query("SELECT new com.example.UberReviewServices.UberReviewServices.models.CustomDriver(d.id, d,name) FROM  Driver as d WHERE d.id = :id AND d.licenseNumber= :ln")
    CustomDriver hqlFindByIdAndLicense(Long id, String ln);*/

    List<Driver> findAllByIdIn(List<Long> driverIds);

}
