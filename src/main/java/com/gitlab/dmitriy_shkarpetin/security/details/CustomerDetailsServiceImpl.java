package com.gitlab.dmitriy_shkarpetin.security.details;

import com.gitlab.dmitriy_shkarpetin.models.Customer;
import com.gitlab.dmitriy_shkarpetin.repositories.CustomersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerDetailsServiceImpl implements UserDetailsService {
    private final CustomersRepository customersRepository;

    @Override
    public UserDetails loadUserByUsername(String nick) throws UsernameNotFoundException {
        return customersRepository.findByNick(nick)
                .map(CustomersDetailsImpl::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
