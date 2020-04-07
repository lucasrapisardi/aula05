import javax.swing.JOptionPane;

public class TesteProduto{
   public static void main (String [] args){
      String nome = JOptionPane.showInputDialog("O que deseja comprar? ");
      double preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do(a)" + nome + "?"));
      int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja comprar de " + nome + "?"));
      double total = preco * quantidade;
      
      //criando um objeto Produto
      Produto produto = new Produto (nome, preco, quantidade);
      
      String msg = "Produto: " + produto.getNome() + "\nPreço: R$" + produto.getPreco() + "\nQuantidade: " + produto.getQuantidade() + "\nTotal de R$" + total;
      
      JOptionPane.showMessageDialog(null, msg);
   }
}