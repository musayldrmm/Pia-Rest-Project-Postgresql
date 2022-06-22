package repository;
import entity.adres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresRepository extends JpaRepository <adres,Long>{

}
