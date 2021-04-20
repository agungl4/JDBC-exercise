package com.enigma.tabungan.dao;

import com.enigma.tabungan.entity.Tabungan;

import java.util.List;

public interface TabunganDao {
    public String addSaldoTabungan(Tabungan tabungan);
    public Integer totalSaldo(Integer id);
}
