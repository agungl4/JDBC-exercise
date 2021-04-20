package com.enigma.tabungan.mapper;

import com.enigma.tabungan.dao.TabunganDao;
import com.enigma.tabungan.entity.Tabungan;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TabunganRowMapper implements RowMapper<Tabungan> {
    @Override
    public Tabungan mapRow(ResultSet resultSet, int i) throws SQLException {
        Tabungan tabungan = new Tabungan();
        tabungan.setId(resultSet.getInt("id"));
        tabungan.setIdUser(resultSet.getInt("id_user"));
        tabungan.setTanggalMenabung(resultSet.getDate("tanggal_menabung"));
        tabungan.setJumlahMenabung(resultSet.getInt("jumlah_menabung"));
        return tabungan;
    }
}
