/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gea.Dto;

import javax.validation.constraints.NotBlank;


public class dtoPersona {
        
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String email;
    @NotBlank
    private String profesion;
    @NotBlank
    private String imgPerfil;
    
    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String descripcion, String email, String profesion, String imgPerfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.email = email;
        this.profesion = profesion;
        this.imgPerfil = imgPerfil;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

        
    
    
}
