package com.enigma.tabungan.runner;

import com.enigma.tabungan.dao.TabunganDao;
import com.enigma.tabungan.entity.Tabungan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Order(2)
public class SecondRunner implements CommandLineRunner {
    @Autowired
    TabunganDao tabunganDao;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("===============2nd Runner================");
        Scanner input = new Scanner(System.in);
        System.out.print("ID user : ");
        Integer idUser = input.nextInt();

        Integer totalSaldo = tabunganDao.totalSaldo(idUser);
        System.out.println(totalSaldo);
    }
}
