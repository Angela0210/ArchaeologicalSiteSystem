package mk.ukim.finki.wp.jan2025g1.repository;

import mk.ukim.finki.wp.jan2025g1.model.ArchaeologicalSite;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArchaeologicalSiteRepository extends JpaSpecificationRepository<ArchaeologicalSite, Long> {
//    List<Product> findByNameContainingIgnoreCase(String text);
}