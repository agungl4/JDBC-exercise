package com.enigma.tabungan.entity;

import java.util.Date;

public class Tabungan {
    private Integer id;
    private Integer idUser;
    private Date tanggalMenabung;
    private Integer jumlahMenabung;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Date getTanggalMenabung() {
        return tanggalMenabung;
    }

    public void setTanggalMenabung(Date tanggalMenabung) {
        this.tanggalMenabung = tanggalMenabung;
    }

    public Integer getJumlahMenabung() {
        return jumlahMenabung;
    }

    public void setJumlahMenabung(Integer jumlahMenabung) {
        this.jumlahMenabung = jumlahMenabung;
    }
}
