/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.kuis_1097.repo;

import com.setia.kuis_1097.entity.Identitas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC32
 */
public interface IdentitasRepo extends CrudRepository<Identitas, Long> {

    @Query("select i from Identitas i")
    public List<Identitas> findAllIdentitas();    
}
