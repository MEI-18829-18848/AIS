package com.appreservas.appreservas.reservas.evento.generated;

import com.appreservas.appreservas.reservas.evento.Evento;
import com.appreservas.appreservas.reservas.organizador.Organizador;
import com.appreservas.appreservas.reservas.sala.Sala;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.appreservas.appreservas.reservas.evento.Evento}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedEventoImpl implements Evento {
    
    private int eventoid;
    private int salaid;
    private int organizadorid;
    private String nome;
    private String descricao;
    private String categoria;
    private String imdbid;
    
    protected GeneratedEventoImpl() {}
    
    @Override
    public int getEventoid() {
        return eventoid;
    }
    
    @Override
    public int getSalaid() {
        return salaid;
    }
    
    @Override
    public int getOrganizadorid() {
        return organizadorid;
    }
    
    @Override
    public Optional<String> getNome() {
        return Optional.ofNullable(nome);
    }
    
    @Override
    public Optional<String> getDescricao() {
        return Optional.ofNullable(descricao);
    }
    
    @Override
    public Optional<String> getCategoria() {
        return Optional.ofNullable(categoria);
    }
    
    @Override
    public Optional<String> getImdbid() {
        return Optional.ofNullable(imdbid);
    }
    
    @Override
    public Evento setEventoid(int eventoid) {
        this.eventoid = eventoid;
        return this;
    }
    
    @Override
    public Evento setSalaid(int salaid) {
        this.salaid = salaid;
        return this;
    }
    
    @Override
    public Evento setOrganizadorid(int organizadorid) {
        this.organizadorid = organizadorid;
        return this;
    }
    
    @Override
    public Evento setNome(String nome) {
        this.nome = nome;
        return this;
    }
    
    @Override
    public Evento setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
    
    @Override
    public Evento setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }
    
    @Override
    public Evento setImdbid(String imdbid) {
        this.imdbid = imdbid;
        return this;
    }
    
    @Override
    public Sala findSalaid(Manager<Sala> foreignManager) {
        return foreignManager.stream().filter(Sala.SALAID.equal(getSalaid())).findAny().orElse(null);
    }
    
    @Override
    public Organizador findOrganizadorid(Manager<Organizador> foreignManager) {
        return foreignManager.stream().filter(Organizador.ORGANIZADORID.equal(getOrganizadorid())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("eventoid = "      + Objects.toString(getEventoid()));
        sj.add("salaid = "        + Objects.toString(getSalaid()));
        sj.add("organizadorid = " + Objects.toString(getOrganizadorid()));
        sj.add("nome = "          + Objects.toString(OptionalUtil.unwrap(getNome())));
        sj.add("descricao = "     + Objects.toString(OptionalUtil.unwrap(getDescricao())));
        sj.add("categoria = "     + Objects.toString(OptionalUtil.unwrap(getCategoria())));
        sj.add("imdbid = "        + Objects.toString(OptionalUtil.unwrap(getImdbid())));
        return "EventoImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Evento)) { return false; }
        final Evento thatEvento = (Evento)that;
        if (this.getEventoid() != thatEvento.getEventoid()) { return false; }
        if (this.getSalaid() != thatEvento.getSalaid()) { return false; }
        if (this.getOrganizadorid() != thatEvento.getOrganizadorid()) { return false; }
        if (!Objects.equals(this.getNome(), thatEvento.getNome())) { return false; }
        if (!Objects.equals(this.getDescricao(), thatEvento.getDescricao())) { return false; }
        if (!Objects.equals(this.getCategoria(), thatEvento.getCategoria())) { return false; }
        if (!Objects.equals(this.getImdbid(), thatEvento.getImdbid())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getEventoid());
        hash = 31 * hash + Integer.hashCode(getSalaid());
        hash = 31 * hash + Integer.hashCode(getOrganizadorid());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getNome()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getDescricao()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCategoria()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getImdbid()));
        return hash;
    }
}