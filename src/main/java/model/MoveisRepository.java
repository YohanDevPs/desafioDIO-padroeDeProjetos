package model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveisRepository extends CrudRepository<Moveis, Long>{

}
