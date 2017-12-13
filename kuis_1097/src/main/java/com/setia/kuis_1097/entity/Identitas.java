/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.kuis_1097.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author PC32
 */
@Entity
@Table(name = "identitas_1097")
public class Identitas implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nim;
    @Column(length = 100, nullable = false)
    private String nama;
    @Column(length = 255, nullable = true)
    private String prodi;
    @Column(length = 255, nullable = true)
    private String alamat;
 

    public Long getId() {
        return nim;
    }

    public void setId(Long nim) {
        this.nim = nim;
    }

    /**
     * @return the name
     */
    public String getName() {
        return nama;
    }

    /**
     * @param name the name to set
     */
    public void setName(String nama) {
        this.nama = nama;
    }

    /**
     * @param description the description to set
     */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /**
     * @return the description
     */
    public String getProdi() {
        return prodi;
    }
    
        public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the description
     */
    public String getAlamat() {
        return alamat;
    }

}
