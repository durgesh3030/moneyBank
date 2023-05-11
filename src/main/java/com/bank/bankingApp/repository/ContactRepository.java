package com.bank.bankingApp.repository;

import com.bank.bankingApp.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Long> {
}
