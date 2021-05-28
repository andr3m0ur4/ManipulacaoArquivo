import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulacaoArquivo {
    File arquivo;

    public void escrever(String caminho, String texto) {
        this.arquivo = new File(caminho);

        try {
            FileWriter writer = new FileWriter(this.arquivo);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write(texto);
            buffer.close();
            writer.close();
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }

    public String ler(String caminho) {
        this.arquivo = new File(caminho);
        StringBuffer texto = new StringBuffer();

        try {
            FileReader reader = new FileReader(this.arquivo);
            BufferedReader buffer = new BufferedReader(reader);
            String linha = "";

            while (linha != null) {
                linha = buffer.readLine();
                if (linha != null) texto.append(linha + "\r\n");
            }
            buffer.close();
            reader.close();
        } catch (IOException erro) {
            erro.printStackTrace();
        }

        return texto.toString();
    }

    public void copiar(String entrada, String saida) {
        try {
            FileInputStream input = new FileInputStream(entrada);
            FileOutputStream output = new FileOutputStream(saida);
            int c;

            do {
                c = input.read();
                if (c != -1) output.write(c);
            } while (c != -1);

            input.close();
            output.close();
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }

    public void informacoes(String caminho) {
        this.arquivo = new File(caminho);

        System.out.println("Nome do arquivo: " + arquivo.getName());
        System.out.println("Caminho: " + arquivo.getAbsolutePath());
        System.out.println("O arquivo existe? " + arquivo.exists());
        System.out.println("É um diretório? " + arquivo.isDirectory());
        System.out.println("É um arquivo? " + arquivo.isFile());
        System.out.println("Pode ser lido? " + arquivo.canRead());
        System.out.println("Pode ser escrito? " + arquivo.canWrite());
    }
}