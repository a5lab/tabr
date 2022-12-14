package com.a5lab.tabr.domain.tenants;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TenantService {

  Collection<Tenant> findAll();

  Page<TenantRecord> findAll(Pageable pageable);

  Optional<TenantRecord> findById(Long id);

  TenantRecord save(TenantRecord entity);

  void deleteById(Long id);
}
