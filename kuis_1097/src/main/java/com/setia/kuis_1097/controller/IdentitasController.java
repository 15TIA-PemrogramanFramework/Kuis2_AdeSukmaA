/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.kuis_1097.controller;

import com.setia.kuis_1097.entity.Identitas;
import com.setia.kuis_1097.service.IdentitasService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC32
 */
@RestController
@RequestMapping("/identitas_1097")
public class IdentitasController implements Serializable {
    
   
    @Autowired
    private IdentitasService identitasService;

    @RequestMapping(method = RequestMethod.POST)
    public Identitas insert(@RequestBody Identitas identitas) {
        return identitasService.insert(identitas);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Identitas update(@RequestBody Identitas identitas) {
        return identitasService.update(identitas);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{nim}")
    public boolean delete(@PathVariable("nim") Long nim) {
        return identitasService.delete(nim);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{nim}")
    public Identitas getById(@PathVariable("nim") Long nim){
        return identitasService.getById(nim);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Identitas> getAll(){
        return identitasService.getAll();
    }

}
