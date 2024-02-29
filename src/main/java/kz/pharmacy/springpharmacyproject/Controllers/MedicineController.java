package kz.pharmacy.springpharmacyproject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import kz.pharmacy.springpharmacyproject.Models.Medicines;
import kz.pharmacy.springpharmacyproject.Services.MedicineService;

import java.util.List;

@RestController
@RequestMapping("/medicine")
public class MedicineController {
    private final MedicineService medicineService;

    @Autowired
    public MedicineController(MedicineService MedicineService) {
        this.medicineService = MedicineService;
    }

    @PostMapping("/add")
    public Medicines addMedicine(@RequestBody Medicines medicine) {
        return medicineService.addMedicine(medicine);
    }
    @GetMapping("/medicines")
    public List<Medicines> getAllMedicines() {
        return medicineService.findAllMedicines();
    }


}