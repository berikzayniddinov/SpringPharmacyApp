package kz.pharmacy.springpharmacyproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kz.pharmacy.springpharmacyproject.Models.Medicines;

public interface MedicineRepository extends JpaRepository<Medicines, Integer> {
    Optional<Medicines> findMedicineByMedicineId(Integer medicine_id);
}
