package com.blibli.model;

import javax.persistence.*;

/**
 * Created by Dias on 1/5/2017.
 */
@Entity
@Table(name = "TBL_MHS")            //contoh untuk merubah nama tabel
public class Mahasiswa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nama_mhs")      //contoh untuk merubah nama kolom
    private String nama;
    private String jurusan;
    private String nim;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
