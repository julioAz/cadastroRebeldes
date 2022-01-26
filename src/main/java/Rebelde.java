import enums.Raca;
import lombok.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Rebelde implements InterfaceRebelde {
    @Getter
    @Setter
    private String Nome = "teste";

    @Getter
    @Setter
    private int Idade = 5;

    @Override
    public void imprimirListaRebeldes(String Nome, int Idade) throws FileNotFoundException, UnsupportedEncodingException {
        @Cleanup PrintWriter writer = new PrintWriter("cadastro-rebeldes.txt", "UTF-8");
        writer.println("Nomes Rebeldes");
        writer.println("Nome: " + Nome + ", Idade: " + Idade + "Raça:");
    }
}
