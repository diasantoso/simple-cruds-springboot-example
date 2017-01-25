package com.blibli.repository;

import com.blibli.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dias on 1/24/2017.
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa,Integer>, MahasiswaRepositoryCustom {

}
