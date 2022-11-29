import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Form extends Frame implements ActionListener {
	Label lblnome = new Label("Nome: "), lblnome2 = new Label("Nome: "), lblsalario = new Label("Salário: "), lblcargo = new Label("Cargo: ");		
	TextField tfnomepesq = new TextField(), tfnome = new TextField(), tfsalario = new TextField(), tfcargo = new TextField();
	Button btpesquisar = new Button("Pesquisar"), btanterior = new Button("Anterior"), btproximo = new Button("Próximo");
	
	Form(String titulo, int largura, int altura, int colinic, int lininic){
		super(titulo);
		addWindowListener(new FechaJanela());
		setSize(largura,altura);
		setLocation(colinic,lininic);
		setLayout(new BorderLayout());
		
		Panel searchPanel = new Panel();
		searchPanel.setLayout(new FlowLayout());
		searchPanel.add(lblnome);
		searchPanel.add(tfnomepesq);
		add(searchPanel, BorderLayout.NORTH);
		
		add(btpesquisar, BorderLayout.CENTER);
		
		Panel resultPanel = new Panel();
		resultPanel.setLayout(new GridLayout(5, 2));
		resultPanel.add(lblnome2);
		resultPanel.add(tfnome);
		resultPanel.add(lblsalario);
		resultPanel.add(tfsalario);
		resultPanel.add(lblcargo);
		resultPanel.add(tfcargo);
		resultPanel.add(btanterior);
		resultPanel.add(btproximo);
		add(resultPanel, BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btpesquisar) {
			
		}
		if (e.getSource()==btanterior) {
			
		}
		if (e.getSource()==btproximo) {
			
		}
		
	}
}
