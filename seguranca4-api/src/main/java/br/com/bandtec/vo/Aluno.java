package br.com.bandtec.vo;

public class Aluno {

    private Integer id;
    private String nome;
    private double peso;
    private int idade;
    
    public Aluno() {
        
    }

    public Aluno(Integer id, String nome, double peso, int idade) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    
    
}

