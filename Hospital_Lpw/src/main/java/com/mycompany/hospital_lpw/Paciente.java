package com.mycompany.hospital_lpw;

public class Paciente extends Dados{
    private String nome;
    private int idade;
    private String cpf;
    private String descricao;
    private String situacao;
    
    public Paciente(String nome, int idade, String cpf, String descricao, String situacao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.descricao = descricao;
        this.situacao = situacao;
    }

    public String getNome()
    {
        return nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public String getCpf()
    {
        return cpf;
    }
    public String getDescricao()
    {
        return descricao;
    }
    public String getSituacao()
    {
        return situacao;
    }

    public void setNome(String nome)
    { 
        this.nome = nome;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    public void setSituacao(String situacao)
    {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Paciente: " + nome + ", Idade: " + idade + ", CPF: " + cpf+" \n Descrição: "+descricao+"\nSituacao: "+situacao;
    }
}