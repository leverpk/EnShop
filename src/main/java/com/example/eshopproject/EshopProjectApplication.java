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
                .productDescription("Standardowy shot 50ml.")
                .productStock(10)
                .productPrice(new BigDecimal("19"))
                .productIcon("https://pixabay.com/get/gc167f48315d80086cb028fdf819bcaf82ecda2ad4bdf342ee379646fa1d96311f4dc8566af7f8609f73e93ce0cf7d47eb8f46a7a6e42132667f327556b88c02c01fd9848f02437b2480d64fd4219f04a_640.jpg")
                .build());
        Product enShotPlus = productRepository.save(Product.builder()
                .productName("En Shot+")
                .productDescription("Shot 50ml bez cukru.")
                .productStock(10)
                .productPrice(new BigDecimal("19"))
                .productIcon("https://pixabay.com/get/g01d2ea3f0dbaaa435140725facd05c576b9c281b786dfabf4951c70a8a4997e6c6c96be0a2df0e44b164f0decdadc9e5268f33e7c943c55e882bf0db8757303da0b7dc8c45f2669b469204e476fb2c07_1280.jpg")
                .build());
        Category shots = categoryRepository.save(Category.builder()
                .categoryName("Shoty")
                .description("Mała dawka wielkiego pobudzacza.")
                .productsList(List.of(enShot, enShotPlus))
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
        Product fruitTea = productRepository.save(Product.builder()
                .productName("Owocowa herbata")
                .productDescription("Herbatka o leśnym zapachu.")
                .productStock(50)
                .productPrice(new BigDecimal("9"))
                .productIcon("https://pixabay.com/get/ge70c538354b575692d7427a02d71114aa1018f3d1ac37df31ebb6b551b7287ae1d2337cec8da2cda1e9abdbb6e09bd526f0e78588c1c94fb9437426709acc6588177bdba4622e3b30e8d957bbbac932b_640.jpg")
                .build());
        Product greenTea = productRepository.save(Product.builder()
                .productName("Zielona herbata")
                .productDescription("Liściasta o wspaniałym zapachu.")
                .productStock(50)
                .productPrice(new BigDecimal("10"))
                .productIcon("https://pixabay.com/get/g9a59b4860f432e6f1c3d457cefb93c28422d2ee7130075f111adad2f7d1790bac9124df5204044efd60516fd162cb9f4ffa18dc4bd94b7bcbd1031f65e23fa2481e0ade7e0db89936b3f3b69f52727a2_640.jpg")
                .build());
        Category tea = categoryRepository.save(Category.builder()
                .categoryName("Herbata")
                .description("Owocowe pobudzacze dla każdego.")
                .productsList(List.of(fruitTea, greenTea))
                .build());
        Product yerba = productRepository.save(Product.builder()
                .productName("Yerba Mate")
                .productDescription("Najpopularniejsza odmiana yerby.")
                .productStock(10)
                .productPrice(new BigDecimal("29"))
                .productIcon("https://pixabay.com/get/g08c55eeec2ae638f87d7a8d7a90304d72bbcf50cc97f45e0e1fbac72e455d5ee51b090e0e1695fc0a86e24db70a8cfd08ad3e6b438b213d47e9b2adaf5e6271b4e651e244d93c74a3f1659448bfc9f91_640.jpg")
                .build());
        Product fruitYerba = productRepository.save(Product.builder()
                .productName("Owocowa Yerba")
                .productDescription("Yerba o smaku owoców leśnych")
                .productStock(10)
                .productPrice(new BigDecimal("35"))
                .productIcon("https://pixabay.com/get/g93789b7c063e07307806b827f0c17e32f5e47e3d910e2885b465705338fb4831ef1ce37c694cc8f6ba1d3ac5b9d39bcbfb80fa050c3ec51e85088e79bd40ea8ce76c92439d76eaa866bbc68a61bc5cd4_640.jpg")
                .build());
        Category yerbaMate = categoryRepository.save(Category.builder()
                .categoryName("Yerba")
                .description("Wspaniały aromat pobudzacza.")
                .productsList(List.of(yerba,fruitYerba))
                .build());
        Product drink1 = productRepository.save(Product.builder()
                .productName("Energol")
                .productDescription("Zwykły lecz niezwykły.")
                .productStock(10)
                .productPrice(new BigDecimal("9"))
                .productIcon("https://pixabay.com/get/gbed7fde988483c0fc7fe6aa9feef24fa5398632175a8accf57ec3b907741442950fa9919b7d1e6b00023fd74bb5ba0012fbd81c7b981f5a9c8803d0be94119adb585c411a7980a7a85ca888a89e46a6d_640.png")
                .build());
        Product drink2 = productRepository.save(Product.builder()
                .productName("Robol")
                .productDescription("Dla pracowników fizycznych.")
                .productStock(10)
                .productPrice(new BigDecimal("9"))
                .productIcon("https://pixabay.com/get/g5fedd72857bd2095b3e0e6d218e783e2feddb35018583b85e4fe98003addd97e007242c6c6889ee6d3afc567d066d14faa4004b02f3e5cefd0bdffd4fbbe8b1352efb1e8255c94c571cbd6edf74a07fe_640.jpg")
                .build());
        Category energyDrinks = categoryRepository.save(Category.builder()
                .categoryName("Energy Drinks")
                .description("Coś dla wariacików.")
                .productsList(List.of(drink1,drink2))
                .build());
        Product pills1 = productRepository.save(Product.builder()
                .productName("Żeńszeń")
                .productDescription("Tableteczki na pobudzonko.")
                .productStock(10)
                .productPrice(new BigDecimal("19"))
                .productIcon("https://pixabay.com/get/gec9837a3dceb6b6a38c7e26fc5b4413dd135a05db710afab89b65130f642b8f50d94bd01ce296effadea5fcbdb94c04fc455aeecba7e13879c6861715230e95e840a2219bcb8bb577d6af073fcd6f090_640.jpg")
                .build());
        Product pills2 = productRepository.save(Product.builder()
                .productName("Afrykański czarodziej")
                .productDescription("Na pobudzenie mózgu i nie tylko.")
                .productStock(10)
                .productPrice(new BigDecimal("19"))
                .productIcon("https://pixabay.com/get/gc060af877a5cea3bc171aa44884dfd92cdccda1161f1d692fa677c04c3ffb76fcf03bb67499101d70f5e6a32ac5f0aa2e49f1b1da53a2ffdf48a747711015f2a0f39d4cc761bd520ad2eec7cb3866746_640.jpg")
                .build());
        Category supplements = categoryRepository.save(Category.builder()
                .categoryName("Suplementy")
                .description("Tableteczki i nie tylko.")
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
