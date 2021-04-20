package com.enigma.tabungan.dao;

import com.enigma.tabungan.entity.Tabungan;
import com.enigma.tabungan.mapper.TabunganRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class TabunganDaoImpl implements TabunganDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public String addSaldoTabungan(Tabungan tabungan) {
        Integer idUser = tabungan.getIdUser();
        Date tanggalMenabung = new Date();
        Integer jumlahMenabung = tabungan.getJumlahMenabung();
        String sql = "INSERT INTO mst_balance(id_user, tanggal_menabung, jumlah_menabung) " +
                "VALUES (?,?,?)";
        String res = (jdbcTemplate.update(sql, idUser, tanggalMenabung, jumlahMenabung)==1) ? "Inserted" : "Error";
        return res;
    }

    @Override
    public Integer totalSaldo(Integer id) {
        String sql = "SELECT * FROM mst_balance WHERE id_user=?";
        List<Tabungan> tabungans = jdbcTemplate
                .query(sql, new TabunganRowMapper(),id );
        Integer totalSaldo = 0;
        for (Tabungan tabungan: tabungans) {
            totalSaldo += tabungan.getJumlahMenabung();
        }
        return totalSaldo;
    }
}
