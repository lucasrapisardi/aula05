public class Turma {
   //atributos
   private String nome;
   private String curso;
   private int serie;
   private int qttAlunos;

   
   //metodo construtor
   public Turma (String n, String c, int s, int qA){
      nome = n;
      curso = c;
      serie = s;
      qttAlunos = qA;
      
   }
   
   //metodos de acesso
   public String getNome(){
      return nome;
   }
   public String getCurso(){
      return curso;
   }
   public int getSerie(){
      return serie;
   }
   
   public int getQttAlunos(){
      return qttAlunos;
   }
   
   //metodos modificadore
   public void setNome (String n){
      nome = n;
   }
   public void setCurso(String c){
      curso = c;
   }
    public void setSerie (int s){
      serie = s;
   }
   public void setQttAlunos (int qA){
      qttAlunos = qA;
   }
  

}