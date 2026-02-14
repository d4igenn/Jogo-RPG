package batalha;
import personagem.classes.Tipo;
public interface Batalha{
    int AtaqueFisico(Tipo inimigo);
    int AtaqueMagico(Tipo inimigo);
    void Curar();
}