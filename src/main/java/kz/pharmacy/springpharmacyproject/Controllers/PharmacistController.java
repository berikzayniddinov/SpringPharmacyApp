package kz.pharmacy.springpharmacyproject.Controllers;


import kz.pharmacy.springpharmacyproject.Models.Pharmacists;
import kz.pharmacy.springpharmacyproject.Services.PharmacistService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pharmacist")
public class PharmacistController{
    private final PharmacistService pharmacistService;
     private PharmacistController(PharmacistService pharmacistService){
         this.pharmacistService = pharmacistService;
     }
     @PostMapping("/new")
    public Pharmacists addPharmacist(@RequestBody Pharmacists Pharmacists){
         return pharmacistService.addPharmacist(Pharmacists);
     }
    @DeleteMapping("/delete/{pharmacist_id}")
    public ResponseEntity<Void> deletePharmacist(@PathVariable Integer pharmacist_id){
         pharmacistService.delete(pharmacist_id);
         return ResponseEntity.noContent().build();
    }
    @GetMapping("/all")
    public List<Pharmacists> getAllPharmacists(){
         return pharmacistService.getAllPharmacists();
        }
    @PostMapping("/register")
    public ResponseEntity<Pharmacists> registerPharmacist(@RequestBody Pharmacists pharmacists) {
        Pharmacists registeredPharmacist = pharmacistService.registerPharmacist(pharmacists);
        return ResponseEntity.ok(registeredPharmacist);
    }

}