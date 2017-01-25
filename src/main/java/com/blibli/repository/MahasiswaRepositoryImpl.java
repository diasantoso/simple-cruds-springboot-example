package com.blibli.repository;

import com.blibli.model.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Dias on 1/25/2017.
 */
public class MahasiswaRepositoryImpl implements MahasiswaRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Mahasiswa> getDias(String text) {
        List<Mahasiswa> data = this.entityManager.createNativeQuery(
                "SELECT id,nama_mhs,jurusan,nim FROM TBL_MHS where nama_mhs='"+text+"'", Mahasiswa.class).getResultList();

        return data;
    }
}
