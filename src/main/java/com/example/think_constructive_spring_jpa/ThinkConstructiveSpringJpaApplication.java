package com.example.think_constructive_spring_jpa;

import com.example.think_constructive_spring_jpa.entity.StoreInformation;
import com.example.think_constructive_spring_jpa.repository.StoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThinkConstructiveSpringJpaApplication implements CommandLineRunner {

    @Autowired
    StoreInformationRepository storeInformationRepository;

    public static void main(String[] args) {
        SpringApplication.run(ThinkConstructiveSpringJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        StoreInformation storeInformationOne = new StoreInformation(
                "Amazon",
                "All sorts of items available",
                "001 123 456 789"
        );
        StoreInformation storeInformationTwo = new StoreInformation(
                "CDON",
                "All sorts of items available",
                "00 46 7 xxx"
        );
        StoreInformation storeInformationThree = new StoreInformation(
                "Wish",
                "All sorts of items available",
                "00 46 7 yyy"
        );
        StoreInformation storeInformationFour = new StoreInformation(
                "Shein",
                "All sorts of items available",
                "00 46 7 zzz"
        );
        storeInformationRepository.save(storeInformationOne);
        storeInformationRepository.save(storeInformationTwo);
        storeInformationRepository.save(storeInformationThree);
        storeInformationRepository.save(storeInformationFour);

        storeInformationRepository.findByStoreName("Amazon").forEach(
                val -> System.out.println(val)
        );
        storeInformationRepository.findByStoreDetails("All sorts of items available").forEach(
                val -> System.out.println(val)
        );
        storeInformationRepository.findByStorePhoneNr("00 46 7 yyy").forEach(
                val -> System.out.println(val)
        );
        storeInformationRepository.findById(4).ifPresent(
                val -> System.out.println(val)
        );
        storeInformationRepository.findById(2).ifPresent(
                val -> System.out.println(val)
        );
        System.out.println(storeInformationRepository.count());
        storeInformationRepository.deleteById(2);
        System.out.println(storeInformationRepository.count());
        storeInformationRepository.findById(2).ifPresent(
                val -> System.out.println(val)
        );
    }
}
