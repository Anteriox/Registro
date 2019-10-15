import java.util.Date;
public class Carrera
{
    private Integer codigo;
    private String nombre;
    private Integer semestre;
    private Integer creditos;
    private String titulo;
    private String director;
    private Date fechainicio;
    public Carrera(){
    } 
    public Carrera(Integer codigo, String nombre, Integer semestre, Integer creditos, String titulo, String director, Date fechainicio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.semestre=semestre;
        this.creditos=creditos;
        this.titulo=titulo;
        this.director=director;
        this.fechainicio=fechainicio;
    } 
    public Integer getCodigo(){
        return codigo;
    }
    public void setCodigo(Integer codigo){
        this.codigo=codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Integer getSemestre(){
        return semestre;
    }
    public void setSemestre(Integer semestre){
        this.semestre=semestre;
    }
    public Integer getCreditos(){
        return creditos;
    }
    public void setcreditos(Integer creditos){
        this.creditos=creditos;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public Date getFechainicio(){
        return fechainicio;
    }
    public void setFechainicio(Date fechainicio){
        this.fechainicio=fechainicio;
    }
}
