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
    @GetMapping("id/{medicine_id}")
    public  ResponseEntity<Medicines> getMedicineById(@PathVariable Integer medicine_id){
        Optional<Medicines> medicine = medicineService.findMedicineByMedicineId(medicine_id);
        if (medicine.isPresent()) {
            return ResponseEntity.ok(medicine.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
        }
}
