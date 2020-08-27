/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "Jugador")
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j"),
    @NamedQuery(name = "Jugador.findByIdJugador", query = "SELECT j FROM Jugador j WHERE j.idJugador = :idJugador"),
    @NamedQuery(name = "Jugador.findByNNombreJugador", query = "SELECT j FROM Jugador j WHERE j.nNombreJugador = :nNombreJugador"),
    @NamedQuery(name = "Jugador.findByNCorreoJugador", query = "SELECT j FROM Jugador j WHERE j.nCorreoJugador = :nCorreoJugador"),
    @NamedQuery(name = "Jugador.findByQPuntajeJugador", query = "SELECT j FROM Jugador j WHERE j.qPuntajeJugador = :qPuntajeJugador")})
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idJugador")
    private Integer idJugador;
    @Basic(optional = false)
    @Column(name = "n_nombre_jugador")
    private String nNombreJugador;
    @Basic(optional = false)
    @Column(name = "n_correo_jugador")
    private String nCorreoJugador;
    @Column(name = "q_puntaje_jugador")
    private String qPuntajeJugador;

    public Jugador() {
    }

    public Jugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public Jugador(Integer idJugador, String nNombreJugador, String nCorreoJugador) {
        this.idJugador = idJugador;
        this.nNombreJugador = nNombreJugador;
        this.nCorreoJugador = nCorreoJugador;
    }

    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public String getNNombreJugador() {
        return nNombreJugador;
    }

    public void setNNombreJugador(String nNombreJugador) {
        this.nNombreJugador = nNombreJugador;
    }

    public String getNCorreoJugador() {
        return nCorreoJugador;
    }

    public void setNCorreoJugador(String nCorreoJugador) {
        this.nCorreoJugador = nCorreoJugador;
    }

    public String getQPuntajeJugador() {
        return qPuntajeJugador;
    }

    public void setQPuntajeJugador(String qPuntajeJugador) {
        this.qPuntajeJugador = qPuntajeJugador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJugador != null ? idJugador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.idJugador == null && other.idJugador != null) || (this.idJugador != null && !this.idJugador.equals(other.idJugador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistencia.Jugador[ idJugador=" + idJugador + " ]";
    }
    
}
