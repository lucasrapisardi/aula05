import javax.swing.JOptionPane;

public class TesteTurma {
   public static void main (String [] args){
      String nome = JOptionPane.showInputDialog("Nome ");
      String curso = JOptionPane.showInputDialog("Curso ");
      int serie = Integer.parseInt(JOptionPane.showInputDialog("Serie "));
      int qttAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos: "));
      
      //criando um objeto turma
      Turma turma = new Turma (nome, curso, serie, qttAlunos);
      
      String msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nSerie: " + turma.getSerie() + "ª Série" + "\nQuantidade de Alunos: " + turma.getQttAlunos() + " alunos"; 
       
      //mostra a turma
      JOptionPane.showMessageDialog(null, msg);
      
      //alterando a quantidaed de alunos
      qttAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));
      
      //muda usando os metodos modificadores
      turma.setQttAlunos(qttAlunos);
      msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nSerie: " + turma.getSerie() + "ª Série" + "\nQuantidade de Alunos: " + turma.getQttAlunos() + " alunos";
      JOptionPane.showMessageDialog(null, msg);
   }
}

