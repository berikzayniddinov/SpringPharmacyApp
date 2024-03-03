package kz.pharmacy.springpharmacyproject.Services.Interfaces;

import kz.pharmacy.springpharmacyproject.Models.Pharmacists;

import java.util.List;

public interface PharmacistServiceInterface {
    Pharmacists addPharmacist(Pharmacists pharmacists);
    void delete(Integer pharmacist_id);
    List<Pharmacists> getAllPharmacists();
    Pharmacists registerPharmacist(Pharmacists pharmacists);
}
