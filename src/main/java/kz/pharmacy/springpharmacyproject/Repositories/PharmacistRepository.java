
package kz.pharmacy.springpharmacyproject.Repositories;

import kz.pharmacy.springpharmacyproject.Models.Pharmacists;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PharmacistRepository extends JpaRepository<Pharmacists, Integer> {
    void deleteById(Integer pharmacist_id);

}
