package kz.pharmacy.springpharmacyproject.Services;

import kz.pharmacy.springpharmacyproject.Models.Pharmacists;
import kz.pharmacy.springpharmacyproject.Repositories.PharmacistRepository;
import kz.pharmacy.springpharmacyproject.Services.Interfaces.PharmacistServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PharmacistService implements PharmacistServiceInterface {

    private final PharmacistRepository pharmacistRepository;
    private PharmacistService(PharmacistRepository pharmacistRepository){
        this.pharmacistRepository = pharmacistRepository;
    }
    @Override
    public Pharmacists addPharmacist(Pharmacists pharmacist){
        return pharmacistRepository.save(pharmacist);
    }


    public void delete(Integer pharmacist_id){
        pharmacistRepository.deleteById(pharmacist_id);
    }

    @Override
    public List<Pharmacists> getAllPharmacists(){
        return pharmacistRepository.findAll();
    }
    public Pharmacists registerPharmacist(Pharmacists pharmacists) {
        return pharmacistRepository.save(pharmacists);
    }
}
