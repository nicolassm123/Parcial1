class Libro {
    private String Titulo;
    private String autor;
    private int numeroDeEjemplares;
    private int numeroEjemplaresPrestados;

    public Libro() {
        this.Titulo = Titulo;
        this.autor = autor;
        this.numeroDeEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;        
        
    }

    public Libro(String Titulo, String autor, int numeroDeEjemplares, int numeroEjemplaresPrestados) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }
    
    public String getTitulo()
    {return Titulo;}
      public void  setTitulo( String Titulo)
      {this.Titulo = Titulo;}
                   
    public String getautor()
    {return autor;}
      public void  setautor( String autor)
      {this.autor = autor;}
    
    public int getnumeroDeEjemplares()
    {return numeroDeEjemplares;}
     public void  setnumeroDeEjemplares( int  numeroDeEjemplares)
     {this.numeroDeEjemplares = numeroDeEjemplares;}
    
    
    public int getnumeroEjemplaresPrestados()
    {return numeroEjemplaresPrestados;}
    public void  setnumeroEjemplaresPrestados( int  numeroEjemplaresPrestados)
    {this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;}
           
    public boolean prestar (){
        if (numeroEjemplaresPrestados < numeroDeEjemplares )
        {    
            numeroEjemplaresPrestados++;
            return true;
        }
        return false;
        }
    
    
    public boolean devolver () {
        if (numeroEjemplaresPrestados > 0)
        
        {
            numeroEjemplaresPrestados--;
            return true;
        }
          return false;  
           }
    
    
    public String imprimir (){
        return ",Titulo:" + Titulo + ",autor:" + ",ejemplares:" + numeroDeEjemplares + ",prestados:" + numeroEjemplaresPrestados;
    }
}
