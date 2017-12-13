/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.kuis_1097.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author PC32
 */
  @Entity
@Table(name = "ipk_1097")
public class Ipk implements Serializable {
  

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255, nullable = true)
    private String semester;
    @Column(length = 255, nullable = true)
    private int ipk;
    @ManyToOne private Identitas identitas;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * @return the ipk
     */
    public int getIpk() {
        return ipk;
    }

    /**
     * @param ipk the ipk to set
     */
    public void setIpk(int ipk) {
        this.ipk = ipk;
    }

    /**
     * @return the identitas
     */
    public Identitas getIdentitas() {
        return identitas;
    }

    /**
     * @param identitas the identitas to set
     */
    public void setIdentitas(Identitas identitas) {
        this.identitas = identitas;
    }



}

