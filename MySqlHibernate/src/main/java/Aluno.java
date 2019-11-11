import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "aluno", uniqueConstraints={@UniqueConstraint(columnNames={"matricula"})})
public class Aluno {
    @Id
    @Column(name = "matricula", length=10, nullable=false, unique=true)
    private String matricula;
    @Column(name = "nome", length = 30, nullable = false)
    private String nome;
    @OneToMany(cascade=CascadeType.ALL, targetEntity = Nota.class)
    @JoinTable(name="nota",joinColumns=@JoinColumn(name="matricula"),inverseJoinColumns=@JoinColumn(name="codigo"))
    private Collection<Nota> nota =new ArrayList<>();

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Collection<Nota> getNota() {
        return nota;
    }

    public void setNota(Collection<Nota> nota) {
        this.nota = nota;
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
