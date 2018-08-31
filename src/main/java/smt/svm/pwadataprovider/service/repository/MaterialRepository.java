package smt.svm.pwadataprovider.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import smt.svm.pwadataprovider.entity.Material;

public interface MaterialRepository extends MongoRepository<Material,String>{
}
