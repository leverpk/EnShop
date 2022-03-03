package com.example.eshopproject;

import com.example.eshopproject.model.Category;
import com.example.eshopproject.model.Customer;
import com.example.eshopproject.model.Product;
import com.example.eshopproject.model.UserRole;
import com.example.eshopproject.repository.CategoryRepository;
import com.example.eshopproject.repository.CustomerRepository;
import com.example.eshopproject.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class EshopProjectApplication implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(EshopProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product enShot = productRepository.save(Product.builder()
                .productName("En Shot")
                .productDescription("Standard 50ml shot with caffeine and taurine.")
                .productStock(10)
                .productPrice(new BigDecimal("7"))
                .productIcon("https://cdn.pixabay.com/photo/2016/04/15/22/13/fruit-juice-1332072_960_720.jpg")
                .build());
        Product enShotPlus = productRepository.save(Product.builder()
                .productName("En Shot+")
                .productDescription("Shot 50ml enriched with omega-3 oils.")
                .productStock(10)
                .productPrice(new BigDecimal("9"))
                .productIcon("https://cdn.pixabay.com/photo/2018/02/13/17/08/pills-3151088_960_720.jpg")
                .build());
        Category shots = categoryRepository.save(Category.builder()
                .categoryName("Shots")
                .description("A small dose of a great stimulant.")
                .productsList(List.of(enShot, enShotPlus))
                .build());
        Product orangeCoffee = productRepository.save(Product.builder()
                .productName("Orange coffee")
                .productDescription("Orange flavored coffee")
                .productStock(100)
                .productPrice(new BigDecimal("19"))
                .productIcon("https://cdn.pixabay.com/photo/2013/08/11/19/46/coffee-171653_960_720.jpg")
                .build());
        Product brazilianCoffee = productRepository.save(Product.builder()
                .productName("Brazilian coffee Santos")
                .productDescription("Straight from the Brazilian heart!")
                .productStock(50)
                .productPrice(new BigDecimal("19"))
                .productIcon("https://cdn.pixabay.com/photo/2022/01/31/15/18/coffee-6984075_960_720.jpg")
                .build());
        Category coffee = categoryRepository.save(Category.builder()
                .categoryName("Coffee")
                .description("Traditional stimulant in various flavor variants.")
                .productsList(List.of(orangeCoffee, brazilianCoffee))
                .build());
        Product fruitTea = productRepository.save(Product.builder()
                .productName("Fruit tea")
                .productDescription("A tea with a forest scent.")
                .productStock(50)
                .productPrice(new BigDecimal("5"))
                .productIcon("https://cdn.pixabay.com/photo/2017/04/05/01/16/food-2203732_960_720.jpg")
                .build());
        Product greenTea = productRepository.save(Product.builder()
                .productName("Green tea")
                .productDescription("Leafy tea with a wonderful scent.")
                .productStock(50)
                .productPrice(new BigDecimal("5"))
                .productIcon("https://cdn.pixabay.com/photo/2017/08/02/19/46/green-tea-2573082_960_720.jpg")
                .build());
        Category tea = categoryRepository.save(Category.builder()
                .categoryName("Tea")
                .description("Fruit stimulants for everyone.")
                .productsList(List.of(fruitTea, greenTea))
                .build());
        Product yerba = productRepository.save(Product.builder()
                .productName("Yerba Mate")
                .productDescription("The most popular variety of yerba.")
                .productStock(10)
                .productPrice(new BigDecimal("15"))
                .productIcon("https://cdn.pixabay.com/photo/2017/06/06/22/55/mate-2378768_960_720.jpg")
                .build());
        Product fruitYerba = productRepository.save(Product.builder()
                .productName("Fruit yerba")
                .productDescription("Yerba with forest fruit flavor.")
                .productStock(10)
                .productPrice(new BigDecimal("15"))
                .productIcon("https://cdn.pixabay.com/photo/2017/06/24/16/49/yerba-mate-2438159_960_720.jpg")
                .build());
        Category yerbaMate = categoryRepository.save(Category.builder()
                .categoryName("Yerba")
                .description("Great aroma of the stimulant.")
                .productsList(List.of(yerba,fruitYerba))
                .build());
        Product drink1 = productRepository.save(Product.builder()
                .productName("LoadEnergy")
                .productDescription("Plain but unusual.")
                .productStock(10)
                .productPrice(new BigDecimal("4"))
                .productIcon("https://cdn.pixabay.com/photo/2020/02/24/06/14/electric-4875313_960_720.jpg")
                .build());
        Product drink2 = productRepository.save(Product.builder()
                .productName("LoadStorm")
                .productDescription("For blue collar workers.")
                .productStock(10)
                .productPrice(new BigDecimal("5"))
                .productIcon("https://cdn.pixabay.com/photo/2020/04/26/17/40/battery-5096397_960_720.jpg")
                .build());
        Category energyDrinks = categoryRepository.save(Category.builder()
                .categoryName("Energy Drinks")
                .description("Something for crazy people.")
                .productsList(List.of(drink1,drink2))
                .build());
        Product pills1 = productRepository.save(Product.builder()
                .productName("Ginseng")
                .productDescription("Siberian ginseng in capsules.")
                .productStock(10)
                .productPrice(new BigDecimal("9"))
                .productIcon("https://cdn.pixabay.com/photo/2019/03/16/20/36/tablets-4059649_960_720.jpg")
                .build());
        Product pills2 = productRepository.save(Product.builder()
                .productName("African wizard")
                .productDescription("For stimulating the brain and more.")
                .productStock(10)
                .productPrice(new BigDecimal("14"))
                .productIcon("https://cdn.pixabay.com/photo/2019/03/26/19/08/tablet-4083463_960_720.jpg")
                .build());
        Category supplements = categoryRepository.save(Category.builder()
                .categoryName("Supplements")
                .description("Tablets and more.")
                .productsList(List.of(pills1, pills2))
                .build());
        final Customer customer1 = customerRepository.save(Customer.builder()
                .firstName("Kamil")
                .lastName("Lewandowski")
                .email("lever@sda.pl")
                .username("lever")
                .password("1234")
                .phone("678211241")
                .address("Suleckiego 51d/12, 81-101, Tarnobrzeg Wielki")
                .role("ROLE_ADMIN")
                .enabled(true)
                .build());

    }
}
