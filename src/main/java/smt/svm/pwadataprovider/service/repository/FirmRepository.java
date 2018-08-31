package smt.svm.pwadataprovider.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import smt.svm.pwadataprovider.entity.Firm;

public interface FirmRepository extends MongoRepository<Firm, String>{

}
