public class elevadorClasse {

    int andar_atual;
    int total_de_andares;
    int capacidade_do_elevador;
    int numero_de_pessoas_no_elevador;

    public elevadorClasse(int total_de_andares, int capacidade_do_elevador) {
        this.andar_atual = 0;
        this.total_de_andares = total_de_andares;
        this.capacidade_do_elevador = capacidade_do_elevador;
        this.numero_de_pessoas_no_elevador = 0;
    }
    public boolean entrar(Integer andar ) {
        if (numero_de_pessoas_no_elevador < capacidade_do_elevador) {
            numero_de_pessoas_no_elevador++;
            if (andar != null) {
                andar_atual = andar;
            }
            System.out.println("Uma pessoa acaba de entrar no elevador. ");
            return true;
        } else {
            System.out.println("O elevador está cheio no momento, não é possível entrar. ");
            return false;
        }

    }
    public void sair(int andar) {
        if (numero_de_pessoas_no_elevador > 0) {
            numero_de_pessoas_no_elevador--;
            andar_atual = andar;
            System.out.println("Uma pessoa acaba de sair do elevador. ");
        } else {
            System.out.println("O elevador está vazio no momento, não há nunguém para sair.");
        }
    }
    public void subir(int andar) {
        if (andar <= total_de_andares) {
            andar_atual = andar;
            System.out.println("Subindo para o andar " + andar_atual + ".");
        } else {
            System.out.println("O elevador só possui " + total_de_andares + " não é possivél acessar este andar .");
        }
    }
    public void descer(int andar) {
        if (andar_atual > 0 ) {
            andar_atual = andar;
            System.out.println("Descendo para o andar " + andar_atual + ".");
        } else {
            System.out.println("Já estamos no terreo, não é possível descer mais.");
        }
    }

}