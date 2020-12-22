package lt2020.sveikinimai.repository;

import org.springframework.data.repository.CrudRepository;

import lt2020.sveikinimai.model.Greeting;

public interface GreetingRepository extends CrudRepository<Greeting, Integer> {

}