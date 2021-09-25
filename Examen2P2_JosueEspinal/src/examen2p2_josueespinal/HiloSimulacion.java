package examen2p2_josueespinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class HiloSimulacion extends Thread {

    private JProgressBar progreso;
    private boolean vive;
    private int contador = 1;
    private int fallo;
    private JTable table;
    private String nombre;
    private String id;

    public HiloSimulacion(JProgressBar progreso, JTable table) {
        this.progreso = progreso;
        this.table = table;
        vive = true;
    }

    public HiloSimulacion(JProgressBar progreso, int fallo, JTable table, String nombre, String id) {
        this.progreso = progreso;
        this.fallo = fallo;
        this.table = table;
        this.nombre = nombre;
        this.id = id;
        vive = true;
    }

    public JProgressBar getProgreso() {
        return progreso;
    }

    public void setProgreso(JProgressBar progreso) {
        this.progreso = progreso;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getFallo() {
        return fallo;
    }

    public void setFallo(int fallo) {
        this.fallo = fallo;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public void fail() throws IOException {
        File archivo = null;
        FileWriter canal = null;
        BufferedWriter ram = null;
        try {
            archivo = new File("./EsamblajesFallidos.txt");
            canal = new FileWriter(archivo, true);
            ram = new BufferedWriter(canal);
            String linea = nombre + " fallo en el ensamblaje del vehiculo ID:" + id;
            ram.write(linea);
            ram.newLine();
            ram.flush();

        } catch (Exception e) {
        }
        ram.close();
        canal.close();

        JOptionPane.showMessageDialog(null, "El ensamblaje fallo, mirar los detalles en el archivo EsamblajesFallidos.txt");
    }

    @Override
    public void run() {
        DefaultTableModel ta = (DefaultTableModel) table.getModel();
        ta.setRowCount(0);
        progreso.setValue(progreso.getMinimum());
        while (vive) {
            if (progreso.getValue() >= progreso.getMaximum()) {
                vive = false;

            } else if (contador <= 3) {
                progreso.setValue(progreso.getValue() + 1);
                progreso.setString("Instalando Bateria...");
                if (contador == 3) {
                    Object[] newrow = {"Minuto " + contador, "Bateria completada"};
                    ta.addRow(newrow);
                    table.setModel(ta);
                } else {
                    Object[] newrow = {"Minuto " + contador, "Instalando Bateria"};
                    ta.addRow(newrow);
                    table.setModel(ta);
                }
            } else if (contador <= 6) {
                progreso.setValue(progreso.getValue() + 1);
                progreso.setString("Instalando Carroceria...");
                if (contador == 6) {
                    Object[] newrow = {"Minuto " + contador, "Carroceria completada"};
                    ta.addRow(newrow);
                    table.setModel(ta);
                } else {
                    Object[] newrow = {"Minuto " + contador, "Instalando Carroceria"};
                    ta.addRow(newrow);
                    table.setModel(ta);
                }

            } else if (contador <= 10) {
                progreso.setValue(progreso.getValue() + 1);
                progreso.setString("Instalando Interior...");
                if (contador == 10) {
                    Object[] newrow = {"Minuto " + contador, "Interior completado"};
                    ta.addRow(newrow);
                    table.setModel(ta);
                } else {
                    Object[] newrow = {"Minuto " + contador, "Instalando Interior"};
                    ta.addRow(newrow);
                    table.setModel(ta);
                }

            } else if (contador <= 12) {
                progreso.setValue(progreso.getValue() + 1);
                progreso.setString("Instalando Infoentretenimiento...");
                if (contador == 12) {
                    Object[] newrow = {"Minuto " + contador, "Infoentretenimiento completado"};
                    ta.addRow(newrow);
                    table.setModel(ta);
                } else {
                    Object[] newrow = {"Minuto " + contador, "Instalando Infoentretenimiento"};
                    ta.addRow(newrow);
                    table.setModel(ta);
                }

            } else {
                progreso.setValue(progreso.getValue() + 1);
                progreso.setString("Instalando Asientos...");
                if (contador == 15) {
                    Object[] newrow = {"Minuto " + contador, "Asientos completados"};
                    ta.addRow(newrow);
                    table.setModel(ta);
                } else {
                    Object[] newrow = {"Minuto " + contador, "Instalando Asientos"};
                    ta.addRow(newrow);
                    table.setModel(ta);
                }

            }
            contador += 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        Random rng = new Random();
        int prob = rng.nextInt(99);
        System.out.println(prob);
        if (fallo <= 5 && prob <= 30) {
            try {
                fail();
            } catch (IOException ex) {
                Logger.getLogger(HiloSimulacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(fallo >= 6 && fallo <= 15 && prob <= 22){
            try {
                fail();
            } catch (IOException ex) {
                Logger.getLogger(HiloSimulacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(fallo >= 16 && fallo <= 30 && prob <= 13){
            try {
                fail();
            } catch (IOException ex) {
                Logger.getLogger(HiloSimulacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(fallo > 30 && prob<= 7){
            try {
                fail();
            } catch (IOException ex) {
                Logger.getLogger(HiloSimulacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "El ensamblaje fue exitoso. Que gran trabajo el de " + nombre + ".");
        }
        

    }

}
