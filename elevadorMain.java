import java.util.Scanner;
public class elevadorMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        elevadorClasse elevador = new elevadorClasse(8, 7 );
        
        System.out.println("Bem vindo ao elevador, o elevador tem " + elevador.total_de_andares + " andares e capacidade para " + elevador.capacidade_do_elevador + " pessoas.");
        System.out.println("O elevador está no andar " + elevador.andar_atual + ".");
        System.out.println("Aperte o botão para entrar no elevador . " );
        sc.nextLine();
        boolean entrou = elevador.entrar(0);
        if (entrou) {
            System.out.println("Digite o andar para qual deseja ir : " );
            int andar_atual = sc.nextInt();
            sc.nextLine();
            while (andar_atual > elevador.total_de_andares) {
                System.out.println("O elevador só possui " + elevador.total_de_andares + " não é possivél acessar este andar .");
                System.out.println("Digite o andar para qual deseja ir : ");
                andar_atual = sc.nextInt();
        
            }
            sc.nextLine();

            elevador.subir(andar_atual);
            System.out.println("Você chegou no andar " + elevador.andar_atual);
            elevador.sair(andar_atual);
            boolean new_people = elevador.entrar(andar_atual);
            if (new_people) {
                System.out.println("Digite o andar para qual deseja ir : " );
                int andar = sc.nextInt();
                sc.nextLine();
                while (andar > elevador.total_de_andares) {
                    System.out.println("Digite o andar para qual deseja ir : ");
                    andar = sc.nextInt();
                    sc.nextLine();
                }
                elevador.descer(andar);
                System.out.println("Você chegou no andar " + elevador.andar_atual);
                elevador.sair(andar);
            }
        }
        

        



        
    }
}
