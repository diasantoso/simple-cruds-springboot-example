package com.blibli.services;

import com.blibli.model.Mahasiswa;
import com.blibli.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dias on 1/24/2017.
 */
@Service
public class MahasiswaServices {

    @Autowired
    MahasiswaRepository mahasiswaRepository;

    public List<Mahasiswa> mhs() {
        List<Mahasiswa> list = mahasiswaRepository.findAll();
        return list;
    }

    public Mahasiswa saveOrUpdate(Mahasiswa m) {
        Mahasiswa cek = mahasiswaRepository.save(m);
        return cek;
    }

    public Mahasiswa getIdMahasiswa(Integer id) {
        Mahasiswa get = mahasiswaRepository.findOne(id);
        return get;
    }

    public void hapus(Integer id) {
        mahasiswaRepository.delete(id);
    }

    public List<Mahasiswa> cariMhs(String cari) {
        List<Mahasiswa> list = mahasiswaRepository.getDias(cari);
        return list;
    }
}
