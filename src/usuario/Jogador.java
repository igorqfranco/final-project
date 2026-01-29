package usuario;

import monstros.Monstro;

public class Jogador {
    private String nome;
    private int pocaoHp;
    private int pocaoIm;
    private Monstro monstro;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPocaoHp() {
        return pocaoHp;
    }

    public void setPocaoHp(int pocaoHp) {
        this.pocaoHp = pocaoHp;
    }

    public int getPocaoIm() {
        return pocaoIm;
    }

    public void setPocaoIm(int pocaoIm) {
        this.pocaoIm = pocaoIm;
    }
}
