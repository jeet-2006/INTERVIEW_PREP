package com.contact.services;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService
{
    List<Contact> list = List.of(
            new Contact(1L, "abc@gmail.com", "jeet", 123L),
            new Contact(2L, "abcd@gmail.com", "jay", 12L)
            );
    @Override
    public List<Contact> getContactsForUser(Long userId) {
        //Fake contact list
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
