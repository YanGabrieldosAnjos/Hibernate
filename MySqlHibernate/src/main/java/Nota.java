import javax.persistence.*;

@Entity
@Table(name = "nota", uniqueConstraints={@UniqueConstraint(columnNames={"codigo"})})
public class Nota {
    @Id
    @Column(name = "codigo", length=10, nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int codigo;
    @ManyToOne(targetEntity = Aluno.class)
    @JoinColumn(name = "aluno.matricula")
    String matricula;
    @Column(name = "nota", length=10,nullable = false)
    float nota;

    public Nota(int codigo, String matricula, float nota) {
        this.codigo = codigo;
        this.matricula = matricula;
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
