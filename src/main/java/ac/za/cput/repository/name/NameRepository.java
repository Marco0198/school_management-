package ac.za.cput.repository.name;
/*
NameRepository.java
Repository for domain Name
@author: Anicka Schouw 217284183
June 2022
 */
import ac.za.cput.domain.name.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<Name,String> {
}
