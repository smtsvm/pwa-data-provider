package smt.svm.pwadataprovider.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import smt.svm.pwadataprovider.entity.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
