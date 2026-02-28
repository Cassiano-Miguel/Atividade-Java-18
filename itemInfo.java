import java.util.Date;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class itemInfo {

    public static void itemInfo(gravacao item) {
        System.out.println(item.toString());
    }

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Bibliotecas");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420, 600);
        frame.setLayout(new FlowLayout());

        JTextField tituloField = new JTextField(35);
        JTextField midiaField = new JTextField(35);
        JComboBox<String> tipoBox = new JComboBox<>(new String[]{"Filme", "Software"});
        JTextField diretorField = new JTextField(35);
        JTextField dataLancamentoField = new JTextField(35);
        JTextField distribuidorField = new JTextField(35);
        JTextField versaoField = new JTextField(35);
        JTextField plataformaField = new JTextField(30);
        JButton adicionarBtn = new JButton("Adicionar");
        JButton limparBtn = new JButton("Limpar");
        JTextArea area = new JTextArea(15, 35);
        ArrayList<gravacao> lista = new ArrayList<>();

        frame.add(new JLabel("Titulo:"));
        frame.add(tituloField);
        frame.add(new JLabel("Midia:"));
        frame.add(midiaField);
        frame.add(new JLabel("Tipo:"));
        frame.add(tipoBox);
        frame.add(new JLabel("Diretor:"));
        frame.add(diretorField);
        frame.add(new JLabel("Data de Lançamento (Dia/Mes/Ano):"));
        frame.add(dataLancamentoField);
        frame.add(new JLabel("Distribuidor:"));
        frame.add(distribuidorField);
        frame.add(new JLabel("Versao:"));
        frame.add(versaoField);
        frame.add(new JLabel("Plataforma:"));
        frame.add(plataformaField);
        frame.add(adicionarBtn);
        frame.add(limparBtn);
        frame.add(new JScrollPane(area));

        adicionarBtn.addActionListener(e -> {
            String titulo = tituloField.getText();
            String midia = midiaField.getText();
            String tipo = (String) tipoBox.getSelectedItem();

            try {
                if (tipo.equals("Filme")) {
                    String diretor = diretorField.getText();
                    Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataLancamentoField.getText());
                    String distribuidor = distribuidorField.getText();
                    gravacao g = new filme(1, 1, titulo, midia, diretor, data, distribuidor);
                    lista.add(g);
                } else {
                    int versao = Integer.parseInt(versaoField.getText());
                    String plataforma = plataformaField.getText();
                    gravacao g = new software(2, 1, titulo, midia, versao, plataforma);
                    lista.add(g);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao adicionar o filme: " + ex.getMessage());
            }
        });

        limparBtn.addActionListener(e -> {
            tituloField.setText("");
            midiaField.setText("");
            diretorField.setText("");
            dataLancamentoField.setText("");
            distribuidorField.setText("");
            versaoField.setText("");
            plataformaField.setText("");
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                try (PrintWriter writer = new PrintWriter("filmes.txt")) {
                    for (gravacao g : lista) {
                        writer.println(g.toString());
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        frame.setVisible(true);
    }
}