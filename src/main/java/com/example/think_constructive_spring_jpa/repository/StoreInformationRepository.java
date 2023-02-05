package com.example.think_constructive_spring_jpa.repository;

import com.example.think_constructive_spring_jpa.entity.StoreInformation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreInformationRepository extends CrudRepository<StoreInformation, Integer> {
    List<StoreInformation> findByStoreName(String storeName);
    List<StoreInformation> findByStorePhoneNr(String storePhoneNr);
    List<StoreInformation> findByStoreDetails(String storeDetails);

    // No need for below because there is a default findById()
    //List<StoreInformation> findByStoreID(Integer storeID);


}
