package com.enigma.tabungan.runner;
import com.enigma.tabungan.dao.UserDao;
import com.enigma.tabungan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class FirstRunner implements CommandLineRunner {

    @Autowired
    UserDao userDao;

    @Override
    public void run(String... args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("nama : ");
        String name = input.next();
        System.out.print("telephone : ");
        String telephone = input.next();
        System.out.print("address : ");
        String address = input.next();
        User user = new User();
        user.setName(name);
        user.setAddress(address);
        user.setTelephone(telephone);
        user.setAddress(address);
        String result = userDao.addNewUser(user);

        System.out.println(user);


    }
}
