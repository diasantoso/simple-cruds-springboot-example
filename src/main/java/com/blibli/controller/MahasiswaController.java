package com.blibli.controller;

import com.blibli.services.MahasiswaServices;
import com.blibli.model.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dias on 1/5/2017.
 */

@Controller
public class MahasiswaController {

    @Autowired
    private MahasiswaServices mahasiswaServices;

    @RequestMapping("/tampilmhs")
    public String MahasiswaList(Model model){
        model.addAttribute("mahasiswa", mahasiswaServices.mhs());
        return "tampilmhs";
    }

    @RequestMapping(value = "/tampilmhs/create", method = RequestMethod.GET)
    public String tampilFormCreate(Model model){
        model.addAttribute("mahasiswa", new Mahasiswa());
        return "create";
    }

    @RequestMapping(value = "/tampilmhs/create", method = RequestMethod.POST)
    public String simpanDataMhs(Model model, Mahasiswa mhs){
        model.addAttribute("mahasiswa", mahasiswaServices.saveOrUpdate(mhs));
        return "redirect:/tampilmhs";
    }

    @RequestMapping(value = "/tampilmhs/edit/{id}", method = RequestMethod.GET)
    public String editData(@PathVariable Integer id, Model model){
        model.addAttribute("mahasiswa", mahasiswaServices.getIdMahasiswa(id));
        return "create";
    }

    @RequestMapping(value = "tampilmhs/hapus/{id}", method = RequestMethod.GET)
    public String hapus(@PathVariable Integer id, Model model){
        mahasiswaServices.hapus(id);
        return "redirect:/tampilmhs";
    }

    @RequestMapping(value = "/tampilmhs/", method = RequestMethod.POST)
    public String MahasiswaList(String cari, Model model){
        if(cari.equalsIgnoreCase(""))
            model.addAttribute("mahasiswa", mahasiswaServices.mhs());
        else
            model.addAttribute("mahasiswa", mahasiswaServices.cariMhs(cari));
        return "tampilmhs";
    }
}
