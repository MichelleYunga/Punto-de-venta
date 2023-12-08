/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author blink
 */
public class Usuario {
  private int id_usuario;
    private Persona id_persona;
    private String user;
    private String password;
    private List<Usuario> tipousuario;

    public Usuario() {
    }

    public Usuario(int id_usuario, Persona id_persona, String user, String password, List<Usuario> tipousuario) {
        this.id_usuario = id_usuario;
        this.id_persona = id_persona;
        this.user = user;
        this.password = password;
        this.tipousuario = tipousuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Persona getId_persona() {
        return id_persona;
    }

    public void setId_persona(Persona id_persona) {
        this.id_persona = id_persona;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Usuario> getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(List<Usuario> tipousuario) {
        this.tipousuario = tipousuario;
    }
}
