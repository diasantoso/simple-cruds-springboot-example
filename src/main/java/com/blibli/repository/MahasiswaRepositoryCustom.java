package com.blibli.repository;

import com.blibli.model.Mahasiswa;

import java.util.List;

/**
 * Created by Dias on 1/25/2017.
 */
public interface MahasiswaRepositoryCustom {
    List<Mahasiswa> getDias(String text);
    Boolean cekLogin(String nama, String npm);
}
