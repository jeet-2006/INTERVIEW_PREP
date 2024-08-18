package com.contact.services;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ContactService {
    public List<Contact> getContactsForUser (Long userId);

}
