package com.mycompany.hospital.Entidades;

public class Medico
{
    private String nome;
    private String cpf;
    private String especialidade;
    private String crm;
    private String situacao;

    public Medico(String nome, String cpf, String especialidade, String crm, String situacao)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.crm = crm;
        this.situacao = situacao;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getEspecialidade()
    {
        return especialidade;
    }

    public void setEspecialidade(String especialidade)
    {
        this.especialidade = especialidade;
    }

    public String getCrm()
    {
        return crm;
    }

    public void setCrm(String crm)
    {
        this.crm = crm;
    }

    public String getSituacao()
    {
        return situacao;
    }

    public void setSituacao(String situacao)
    {
        this.situacao = situacao;
    }   
}
