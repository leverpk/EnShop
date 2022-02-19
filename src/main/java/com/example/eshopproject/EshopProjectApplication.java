package com.example.eshopproject;

import com.example.eshopproject.model.Category;
import com.example.eshopproject.model.Customer;
import com.example.eshopproject.repository.CategoryRepository;
import com.example.eshopproject.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class EshopProjectApplication implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(EshopProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Category shots = categoryRepository.save(Category.builder()
                .categoryName("Shoty")
                .description("Mała dawka wielkiego pobudzacza.")
                .build());
        Category coffee = categoryRepository.save(Category.builder()
                .categoryName("Kawa")
                .description("Tradycyjny pobudzacz w różnych wariancjach smakowych.")
                .build());
        Category tea = categoryRepository.save(Category.builder()
                .categoryName("Herbata")
                .description("Owocowe pobudzacze dla każdego.")
                .build());
        Category yerbaMate = categoryRepository.save(Category.builder()
                .categoryName("Yerba")
                .description("Wspaniały aromat pobudzacza.")
                .build());
        Category energyDrinks = categoryRepository.save(Category.builder()
                .categoryName("Energy Drinks")
                .description("Coś dla wariacików.")
                .build());
        Category supplements = categoryRepository.save(Category.builder()
                .categoryName("Suplementy")
                .description("Tableteczki i nie tylko.")
                .build());
    }
}
