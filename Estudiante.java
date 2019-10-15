public class Estudiante
{
    private Integer codigo;
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private Integer edad;
    private String documento;
    private String tipo_documento;
    private Integer creditoscursados;
    private Integer semestrescursados;
    private String estado;
    private Carrera carrera;
    public Estudiante(){
    }   
    public Estudiante(Integer codigo, String nombre, String telefono, String email,String direccion, Integer edad, String documento , String tipo_documento, Integer creditoscursados, Integer semestrescursados, String estado, Carrera carrera){
        this.codigo=codigo;
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
        this.direccion=direccion;
        this.edad=edad;
        this.documento=documento;
        this.tipo_documento=tipo_documento;
        this.creditoscursados=creditoscursados;
        this.semestrescursados=semestrescursados;
        this.estado=estado;
        this.carrera=carrera;
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
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    } 
    public Integer getEdad(){
        return edad;
    }
    public void setEdad(Integer edad){
        this.edad=edad;
    }
    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento=documento;
    } 
    public String getTipo_documento(){
        return tipo_documento;
    }
    public void setTipo_documento(String tipo_documento){
        this.tipo_documento=tipo_documento;
    } 
    public Integer getCreditoscursados(){
        return creditoscursados;
    }
    public void setCreditoscursados(Integer creditoscursados){
        this.creditoscursados=creditoscursados;
    }
    public Integer getSemestrescursados(){
        return semestrescursados;
    }
    public void setsemestrescursados(Integer semestrescursados){
        this.semestrescursados=semestrescursados;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public void calcular_mayordeedad(){
        if (getEdad()>=18){
            System.out.println("El estudiante es mayor de edad");
        }
        else {
            System.out.println("El estudiante es menor de edad");
        }
    } 
    public void fin_carrera(){
        if(getCreditoscursados()>=carrera.getCreditos()){
            System.out.println("El estudiante lleva cursado:" +getCreditoscursados()+" creditos");
            System.out.println("La carrera tiene un total de:" +carrera.getCreditos()+" creditos");
            System.out.println("Esta a un paso de ser:   "+carrera.getTitulo());
        }
        else {   
            System.out.println("Aun te Faltan Creditos");
        }
    }
    public void matricularProyecto(){
        if(getCreditoscursados()>=(carrera.getCreditos()*0.7)&&getSemestrescursados()>7)
        {
            System.out.println("Ya tiene el derecho de Matricular el Proyecto de Grado");}

        else
            System.out.println("Faltan Creditos para poder Matricual el Proyectyo de grado");
    }
    public void promedioCreditosSemestre(){
        Float promedio=(float)(getCreditoscursados()/getSemestrescursados());       
        System.out.println("El promedio de creditos cursados es: " + promedio);   
    }
    
    public void actualizarEstado(){
        if (getSemestrescursados()>=carrera.getSemestre()*2){
             this.estado ="PFU";
        }
        System.out.println("Los semestres que han cursado son: " + getSemestrescursados());
        System.out.println("Los semestres que han cursados son: " +carrera.getSemestre());   
    } 
}
