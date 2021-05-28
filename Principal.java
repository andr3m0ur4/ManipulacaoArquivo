import java.io.File;

public class Principal {
    public static void main(String[] args) {
        ManipulacaoArquivo arquivo = new ManipulacaoArquivo();

        /* String texto = "Estou escrevendo esse arquivo\nEspero que dê tudo certo!";
        arquivo.escrever("C:\\Users\\moura\\OneDrive\\Documentos\\Java\\ManipulacaoArquivo\\arquivo.txt", texto);
        System.out.print(arquivo.ler("C:\\Users\\moura\\OneDrive\\Documentos\\Java\\ManipulacaoArquivo\\Principal.java")); */

        //arquivo.copiar("C:\\Users\\moura\\OneDrive\\Documentos\\Java\\ManipulacaoArquivo\\Duke.jpg", "C:\\Users\\moura\\OneDrive\\Documentos\\Java\\ManipulacaoArquivo\\novo-duke.jpg");

        arquivo.informacoes("C:\\Users\\moura\\OneDrive\\Documentos\\Java\\ManipulacaoArquivo");

        System.out.println("Separador de Path: " + File.pathSeparator);
        System.out.println("Separador de Diretório: " + File.separator);
        
        File discos[] = File.listRoots();
        for (File disco : discos) {
            System.out.println("Disco: " + disco.toString());
        }
    }
}
