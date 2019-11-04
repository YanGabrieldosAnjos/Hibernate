import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "aluno", uniqueConstraints={@UniqueConstraint(columnNames={"matricula"})})
public class Aluno {
    @Id
    @Column(name = "matricula", length=10, nullable=false, unique=true)
    private String matricula;
    @Column(name = "nome", length = 30, nullable = false)
    private String nome;
    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
