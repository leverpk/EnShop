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
        Category shots = categoryRepository.save(Category.builder()
                .categoryName("Shoty")
                .description("Mała dawka wielkiego pobudzacza.")
                .build());
        Product orangeCoffee = productRepository.save(Product.builder()
                .productName("Kawa pomarańczowa")
                .productDescription("Kawa o smaku pomarańczowym")
                .productStock(100)
                .productPrice(new BigDecimal("49"))
                .productIcon("https://pixabay.com/get/g9ec5a1f2adfe3a45831ba9137bf39c84b19cf96cb15a9caa1a89f2d9b8c8fc0096d81b01748ce15921c7ce3c3a32bb22d3aaa5c823f7a564e2befe9d93d95e27d4ee584ebf0d33e1953e8c15f101a559_640.jpg")
                .build());
        Product brazilianCoffee = productRepository.save(Product.builder()
                .productName("Kawa brazylijska Santos")
                .productDescription("Prosto z brazylijskiego serca!")
                .productStock(50)
                .productPrice(new BigDecimal("39"))
                .productIcon("https://pixabay.com/get/gd1267fbc44d6cef2de07b9e7311b0ef7490f09e4f061b031deb9108414f0bcfacbcf32d477ae80090acce75cba3f6bf514f81b762425fc01cd482a63083a0ea546a561c78641656a7754654a51335d2b_640.jpg")
                .build());
        Category coffee = categoryRepository.save(Category.builder()
                .categoryName("Kawa")
                .description("Tradycyjny pobudzacz w różnych wariancjach smakowych.")
                .productsList(List.of(orangeCoffee, brazilianCoffee))
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
