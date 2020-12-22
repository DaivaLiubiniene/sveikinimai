package lt2020.sveikinimai.repository;
import org.springframework.data.repository.CrudRepository;
import lt2020.sveikinimai.model.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}