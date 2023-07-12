package in.johnpark.dnsupdater.repository;

import in.johnpark.dnsupdater.model.Subdomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubdomainRepository extends JpaRepository<Subdomain, Integer> {
}