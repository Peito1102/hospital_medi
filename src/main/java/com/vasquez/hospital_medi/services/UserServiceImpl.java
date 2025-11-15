package com.vasquez.hospital_medi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vasquez.hospital_medi.DTO.UserRegister;
import com.vasquez.hospital_medi.entities.Role;
import com.vasquez.hospital_medi.entities.UserMedi;
import com.vasquez.hospital_medi.repositories.RoleRepository;
import com.vasquez.hospital_medi.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional(readOnly = true)
    public List<UserMedi> findAll() {
        List<UserMedi> lista = userRepository.findAll();
        System.out.println(lista);
        lista.forEach(u -> u.getRoles().forEach(r -> System.out.println(r.getName() + " " + r.getId())));
        return lista;
    }

    @Override
    @Transactional
    public UserMedi save(UserRegister userDTO) {
        Optional<Role> optionalRoleUser = roleRepository.findByName("ROLE_USER");
        List<Role> roles = new ArrayList<>();
        UserMedi user = new UserMedi();

        optionalRoleUser.ifPresent(roles::add);
        
        if (user.isAdmin()) {
            Optional<Role> optionalRoleAdmin = roleRepository.findByName("ROLE_ADMIN");
            optionalRoleAdmin.ifPresent(roles::add);
        }

        user.setUsername(userDTO.getUsername());
        user.setName(userDTO.getName());
        user.setLastName(userDTO.getLastName());
        user.setDni(userDTO.getDni());
        user.setPhone(userDTO.getPhone());
        user.setRoles(roles);
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

}