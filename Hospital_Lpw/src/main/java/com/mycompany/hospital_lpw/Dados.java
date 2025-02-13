package com.mycompany.hospital_lpw;

import java.util.ArrayList;

public class Dados
{
    //pacientes
    ArrayList <String> pacienteNomes = new ArrayList<String>();
    ArrayList <Integer> pacienteIdades = new ArrayList<Integer>();
    ArrayList <String> pacienteCpfs = new ArrayList<String>();
    ArrayList <String> pacienteDescs = new ArrayList<String>();
    ArrayList <String> pacienteSituacoes = new ArrayList<String>();
    //médicos
    ArrayList <String> medicoNomes = new ArrayList<String>();
    ArrayList <String> medicoCpfs = new ArrayList<String>();
    ArrayList <String> medicoEspecialidades = new ArrayList<String>();
    ArrayList <String> medicoCrm = new ArrayList<String>();
    ArrayList <String> medicoSituacoes = new ArrayList<String>();
    //Consultas
    ArrayList <String> consultaPaciente = new ArrayList<String>();
    ArrayList <String> consultaMedico = new ArrayList<String>();
    ArrayList <String> consultaData = new ArrayList<String>();
    ArrayList <String> consultaHora = new ArrayList<String>();
    ArrayList <String> consultaSituacao = new ArrayList<String>();
    ArrayList <String> consultaDescricao = new ArrayList<String>();
    
    public void addPaciente(String nome, int idade, String cpf, String descricao, String situacao)
    {
        pacienteNomes.add(nome);
        pacienteIdades.add(idade);
        pacienteCpfs.add(cpf);
        pacienteDescs.add(descricao);
        pacienteSituacoes.add(situacao);
    }

    public void addMedico(String nome, String cpf, String especialidade, String crm, String situacao)
    {
        medicoNomes.add(nome);
        medicoCpfs.add(cpf);
        medicoEspecialidades.add(especialidade);
        medicoCrm.add(crm);
        medicoSituacoes.add(situacao);
    }

    public void addConsulta(String paciente, String medico, String data, String hora, String situacao, String descricao)
    {
        consultaPaciente.add(paciente);
        consultaMedico.add(medico);
        consultaData.add(data);
        consultaHora.add(hora);
        consultaSituacao.add(situacao);
        consultaDescricao.add(descricao);
    }

    public String mostrarListaPacientes() {
        if (pacienteNomes.isEmpty()) {
            return "Nenhum paciente cadastrado.";
        }
        String lista = "";
        for (int i = 0; i < pacienteNomes.size(); i++) {
            lista += "Nome: " + pacienteNomes.get(i) + "\nIdade: " + pacienteIdades.get(i) + "\nCPF: " + pacienteCpfs.get(i) + "\nDescrição: " + pacienteDescs.get(i) + "\nSituação: " + pacienteSituacoes.get(i) + "\n\n";
        }
        return lista;
    }

    public String mostrarListaMedicos() {
        if (medicoNomes.isEmpty()) {
            return "Nenhum médico cadastrado.";
        }
        String lista = "";
        for (int i = 0; i < medicoNomes.size(); i++) {
            lista += "Nome: " + medicoNomes.get(i) + "\nCPF: " + medicoCpfs.get(i) + "\nEspecialidade: " + medicoEspecialidades.get(i) + "\nCRM: " + medicoCrm.get(i) + "\nSituação: " + medicoSituacoes.get(i) + "\n\n";
        }
        return lista;
    }

    public String mostrarListaConsultas()
    {
        if (consultaPaciente.isEmpty()) {
            return "Nenhuma consulta cadastrada.";
        }
        String lista = "";
        for (int i = 0; i < consultaPaciente.size(); i++) {
            lista += "Paciente: " + consultaPaciente.get(i) + "\nMédico: " + consultaMedico.get(i) + "\nData: " + consultaData.get(i) + "\nHora: " + consultaHora.get(i) + "\nSituação: " + consultaSituacao.get(i) + "\nDescrição: " + consultaDescricao.get(i) + "\n\n";
        }
        return lista;
    }
    
    public ArrayList<String> getPacienteCpfs() {
        return pacienteCpfs;
    }

    public ArrayList<String> getPacienteDescs() {
        return pacienteDescs;
    }

    public ArrayList<Integer> getPacienteIdades() {
        return pacienteIdades;
    }

    public ArrayList<String> getPacienteNomes() {
        return pacienteNomes;
    }

    public ArrayList<String> getPacienteSituacoes() {
        return pacienteSituacoes;
    }

    public void setPacienteCpfs(ArrayList<String> pacienteCpfs) {
        this.pacienteCpfs = pacienteCpfs;
    }

    public void setPacienteDescs(ArrayList<String> pacienteDescs) {
        this.pacienteDescs = pacienteDescs;
    }

    public void setPacienteIdades(ArrayList<Integer> pacienteIdades) {
        this.pacienteIdades = pacienteIdades;
    }

    public void setPacienteNomes(ArrayList<String> pacienteNomes) {
        this.pacienteNomes = pacienteNomes;
    }

    public void setPacienteSituacoes(ArrayList<String> pacienteSituacoes) {
        this.pacienteSituacoes = pacienteSituacoes;
    }

    //Consulta

    public ArrayList<String> getConsultaData() {
        return consultaData;
    }

    public ArrayList<String> getConsultaDescricao() {
        return consultaDescricao;
    }

    public ArrayList<String> getConsultaHora() {
        return consultaHora;
    }

    public ArrayList<String> getConsultaMedico() {
        return consultaMedico;
    }

    public ArrayList<String> getConsultaPaciente() {
        return consultaPaciente;
    }

    public ArrayList<String> getConsultaSituacao() {
        return consultaSituacao;
    }

    public void setConsultaData(ArrayList<String> consultaData) {
        this.consultaData = consultaData;
    }

    public void setConsultaDescricao(ArrayList<String> consultaDescricao) {
        this.consultaDescricao = consultaDescricao;
    }

    public void setConsultaHora(ArrayList<String> consultaHora) {
        this.consultaHora = consultaHora;
    }

    public void setConsultaMedico(ArrayList<String> consultaMedico) {
        this.consultaMedico = consultaMedico;
    }

    public void setConsultaPaciente(ArrayList<String> consultaPaciente) {
        this.consultaPaciente = consultaPaciente;
    }

    public void setConsultaSituacao(ArrayList<String> consultaSituacao) {
        this.consultaSituacao = consultaSituacao;
    }

    //Médico

    public ArrayList<String> getMedicoCpfs() {
        return medicoCpfs;
    }

    public ArrayList<String> getMedicoCrm() {
        return medicoCrm;
    }

    public ArrayList<String> getMedicoEspecialidades() {
        return medicoEspecialidades;
    }

    public ArrayList<String> getMedicoNomes() {
        return medicoNomes;
    }

    public ArrayList<String> getMedicoSituacoes() {
        return medicoSituacoes;
    }

    public void setMedicoCpfs(ArrayList<String> medicoCpfs) {
        this.medicoCpfs = medicoCpfs;
    }

    public void setMedicoCrm(ArrayList<String> medicoCrm) {
        this.medicoCrm = medicoCrm;
    }

    public void setMedicoEspecialidades(ArrayList<String> medicoEspecialidades) {
        this.medicoEspecialidades = medicoEspecialidades;
    }
    
    public void setMedicoNomes(ArrayList<String> medicoNomes) {
        this.medicoNomes = medicoNomes;
    }

    public void setMedicoSituacoes(ArrayList<String> medicoSituacoes) {
        this.medicoSituacoes = medicoSituacoes;
    }
}