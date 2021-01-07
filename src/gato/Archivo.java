
package gato;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Archivo implements Serializable{
    
    ArrayList<Usuario> usuarios = new ArrayList();
    
    public void leer() throws FileNotFoundException, IOException, ClassNotFoundException{
        try{
            FileInputStream users = new FileInputStream("usuarios.dat");
            ObjectInputStream entrada = new ObjectInputStream(users);
            usuarios = (ArrayList)entrada.readObject();
            entrada.close();
        }catch(Exception e){
            guardar();
        }
    }
  
    public void guardar() throws FileNotFoundException, IOException{
        FileOutputStream users = new FileOutputStream("usuarios.dat");
        ObjectOutputStream salida = new ObjectOutputStream(users);
        salida.writeObject(usuarios);
        salida.close();
    }
    
    public void agregarUsuario(String nombre, int edad, int puntuacion) throws IOException, FileNotFoundException, ClassNotFoundException {
        if(verificar(nombre)){
            Usuario objusu = new Usuario(nombre,edad,puntuacion);
            try{
                leer();
            }catch (Exception e){

            }
            usuarios.add(objusu);
            guardar();
        }else{
            JOptionPane.showMessageDialog(null, "Ese nombre ya esta registrado");
        }
    }
    
    public void borrarTarea(int a){
        try {
            leer();
            usuarios.remove(a);
            guardar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Seleccione un usuario");
        }
    }
    
    public void ModificarTarea(String Op, int pos){ 
        try{
            leer();
            String nombre = usuarios.get(pos).getNombre();
            int edad = usuarios.get(pos).getEdad();
            int puntuacion = usuarios.get(pos).getPuntiacion();
            usuarios.remove(pos);
            switch(Op){
                case "Nombre":
                    do{
                        nombre = JOptionPane.showInputDialog("Escriba su nombre");
                        if(nombre.equals("")){
                            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
                        }
                    }while(nombre.equals(""));
                    break;
                case "Edad":
                    String edades[] = new String[100];
                    for(int i=0;i<edades.length;i++){
                        int var = i+1;
                        edades[i] = String.valueOf(var);
                    }
                    JComboBox comboBox = new JComboBox(edades); comboBox.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, comboBox, "Ingrese su edad",JOptionPane.QUESTION_MESSAGE);
                    edad = Integer.parseInt(comboBox.getSelectedItem().toString());
                    break;
            }
            if(verificar(nombre)){
                Usuario aux = new Usuario(nombre,edad,puntuacion);
                usuarios.add(pos,aux);
                guardar();
            }else{
                JOptionPane.showMessageDialog(null, "Ese nombre ya esta registrado");
            }
        }catch(Exception e){    
            
        }    
    }
    
    public void comprobar() throws IOException{
        if(usuarios.size()>10){
            usuarios.remove(0);
        }
        guardar();
    }
    
    public String[] obtenerTabla(int k) throws IOException, FileNotFoundException, ClassNotFoundException{
        leer();
        String table[] = new String[3];
        Usuario auxiliar = usuarios.get(k);
        table[0] = auxiliar.getNombre();
        table[1] = String.valueOf(auxiliar.getEdad());
        table[2] = String.valueOf(auxiliar.getPuntiacion());

        return table;
    }
    
    public int tamanio(){
        try {
            leer();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios.size();
    }
    
    public boolean verificar(String nombre){
        boolean x = true;
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getNombre().equals(nombre)){
                x = false;
            }
        }
        return x;
    }
    
    public String[] recuperarNombres(){
        try {
            leer();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        String st[] = new String[usuarios.size()];
        for(int i=0;i<usuarios.size();i++){
            st[i] = usuarios.get(i).getNombre();
        }
        return st;
    }
    
    public void SumarPuntos(String ganador){
        try {
            leer();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getNombre().equals(ganador)){
                usuarios.get(i).setPuntiacion(usuarios.get(i).getPuntiacion()+10);
            }
        }
        try {
            guardar();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
