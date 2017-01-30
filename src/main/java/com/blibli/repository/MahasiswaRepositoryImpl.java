package com.blibli.repository;

import com.blibli.model.Mahasiswa;
import com.sun.org.apache.xpath.internal.operations.Bool;
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

    @Override
    public Boolean cekLogin(String nama, String npm) {
        List<Mahasiswa> cek = this.entityManager.createNativeQuery(
                "SELECT id,nama_mhs,jurusan,nim FROM TBL_MHS WHERE nama_mhs='"+nama+"' AND nim='"+npm+"'", Mahasiswa.class).getResultList();

        int p = cek.size();

        if(p==0)
            return false;
        else
            return true;
    }
}
