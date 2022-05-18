package com.example.MBankTest.service.database.impl;


import com.example.MBankTest.entity.Role;
import com.example.MBankTest.repository.RoleRepository;
import com.example.MBankTest.service.base.impl.CrudServiceImpl;
import com.example.MBankTest.service.database.RoleService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleServiceImpl extends CrudServiceImpl<Role> implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        super(roleRepository);
        this.roleRepository = roleRepository;
    }
}
