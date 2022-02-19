package com.example.eshopproject.service;

import com.example.eshopproject.model.Customer;
import com.example.eshopproject.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JpaCustomerService implements CustomerService, UserDetailsService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer findById(Long id) {
        return customerRepository.getById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return customerRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Użytkownik nie znaleziony."));
    }
}
