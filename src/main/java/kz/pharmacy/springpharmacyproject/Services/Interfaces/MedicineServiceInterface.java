package kz.pharmacy.springpharmacyproject.Services.Interfaces;

import kz.pharmacy.springpharmacyproject.Models.Medicines;

import java.util.List;

public interface MedicineServiceInterface {
    Medicines addMedicine(Medicines medicines);
    List<Medicines> findAllMedicines();
}
