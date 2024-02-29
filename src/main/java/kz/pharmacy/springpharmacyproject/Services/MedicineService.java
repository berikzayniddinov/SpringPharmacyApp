package kz.pharmacy.springpharmacyproject.Services;

import kz.pharmacy.springpharmacyproject.Models.Medicines;

import kz.pharmacy.springpharmacyproject.Repositories.MedicineRepository;
import kz.pharmacy.springpharmacyproject.Services.Interfaces.MedicineServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService  implements MedicineServiceInterface {
    private final MedicineRepository medicineRepository;
    @Autowired
    public MedicineService(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }
    public Medicines addMedicine(Medicines medicines) {
        return medicineRepository.save(medicines);
    }


    public List<Medicines> findAllMedicines() {

        return medicineRepository.findAll();
    }
}

