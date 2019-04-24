import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class JFAdministracion extends JFrame 
{
    //definimos atributos del formulario
    private JPanel p1,p2,p3;
    private JLabel lblNombre,lblPropietario,lblArea,lblHabitantes,lblValor;
    private JTextArea txtNombre,txtPropietario,txtArea,txtHabitantes,txtValor;
    private JButton btnBuscar,btnCalcular,btnLimpiar;
    private JCheckBox checkProntoPago,checkPlataforma;
    
    //Definimos constructor con los parametros
    public JFAdministracion() 
    {
       setTitle("Administracion de condominio");
       setVisible(true);
       setSize(350,400);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setResizable(false);
       setLayout(new BorderLayout());
       
       //Crear panel p1
       p1=new JPanel();
       p1.setLayout(new GridLayout(5,2,5,5));
       p1.setPreferredSize(new Dimension (350,200));
       p1.setBackground(Color.red );
       p1.setBorder(new TitledBorder("Datos de la propiedad"));
       
       //Crear panel p2
       p2=new JPanel();
       p2.setLayout(new FlowLayout());
       p2.setPreferredSize(new Dimension (350,100));
       p2.setBackground(Color.orange);
       p2.setBorder(new TitledBorder("Descuentos"));
       
       //Crear panel p3
       p3=new JPanel();
       p3.setLayout(new GridLayout(2,2,5,5));
       p3.setPreferredSize(new Dimension (350,100));
       p3.setBackground(Color.gray);
       p3.setBorder(new TitledBorder("Calculos y resultados"));
       
       //Añadir panel 1 al formulario
       add(p1,BorderLayout.NORTH);
       add(p2,BorderLayout.CENTER);
       add(p3,BorderLayout.SOUTH);
       
       //Crear los elementos graficos del panel 1
       lblNombre = new JLabel("Nombre");
       lblPropietario = new JLabel("propietario");
       lblArea = new JLabel("Area (m^2)");
       lblHabitantes = new JLabel("# Habitantes");
       btnBuscar = new JButton("Buscar");
       
       txtNombre = new JTextArea("");
       txtPropietario = new JTextArea("");
       txtArea = new JTextArea("");
       txtHabitantes = new JTextArea("");
       
       p1.add(lblNombre);
       p1.add(txtNombre);
       p1.add(lblPropietario);
       p1.add(txtPropietario);
       p1.add(lblArea);
       p1.add(txtArea);
       p1.add(lblHabitantes);
       p1.add(txtHabitantes);
       p1.add(btnBuscar);
       
       //Crear los elementos graficos del panel 2
       checkProntoPago = new JCheckBox("Pronto pago",false);
       checkPlataforma = new JCheckBox("Pago plataforma",false);
       
       p2.add(checkProntoPago);
       p2.add(checkPlataforma);
       
       //Crear los elementos graficos del panel 3
       lblValor = new JLabel("valor pagar");
       txtValor = new JTextArea("");
       btnCalcular = new JButton("calcular");
       btnLimpiar = new JButton("Limpiar");
       
       p3.add(lblValor);
       p3.add(txtValor);
       p3.add(btnCalcular);
       p3.add(btnLimpiar);
    }
    
    
}
