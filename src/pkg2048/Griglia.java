/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;

import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Griglia {

    int[][] g;
    private int numeri;
    private int punti;
    private int record;
    final private int SIZE = 4;
    final private boolean ERR = false;

    public Griglia() {
        g = new int[SIZE][SIZE];
        punti = 0;
        numeri = 0;
        record = caricaRecord();
        aggiungi();
        aggiungi();
    }
    
    public Griglia(Griglia griglia) {
        g = new int[SIZE][SIZE];
        punti = griglia.getPunti();
        record = griglia.getRecord();
        numeri = griglia.getNumeri();
        for (int i = 0; i < SIZE; i++) {
            System.arraycopy(griglia.g[i], 0, g[i], 0, SIZE);
        }
    }
    
    /**
     * Apre il file "punti.txt" contenente il record
     * @return Ritorna un numero intero, ovvero il massimo punteggio raggiunto
     */
    private int caricaRecord(){
        try {
            BufferedReader r = new BufferedReader(new FileReader("punti.txt"));
            int n = Integer.parseInt(r.readLine());
            r.close();
            return n;
        } catch (FileNotFoundException ex) {
            System.err.println("Errore apertura file");
        } catch (IOException ex) {
            System.err.println("Errore caricamento punteggio da file");
        }
        return 0;
    }
    
    /**
     * Funzione che salva sul file "punti.txt" la variabile record
     */
    private synchronized void salvaRecord(){
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter("punti.txt"));
            w.write(record+"");
            w.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Errore apertura file");
        } catch (IOException ex) {
            System.err.println("Errore scrittura punteggio su file");
        }
    }
    
    public int getNumeri() {
        return numeri;
    }

    /**
     * 
     * @return Restituisce il punteggio della partita corrente
     */
    public int getPunti() {
        return punti;
    }
    
    /**
     * 
     * @return Restituisce il punteggio massimo ottenuto
     */
    public int getRecord() {
        return record;
    }

    /**
     * Aggiunge 2 o 4(con meno probabilità) in una posizione vuota casuale nella
     * griglia.
     *
     * @return Ritorna false in caso la griglia è piena e non ci sono più mosse
     * disponibili, true se ha aggiunto il numero.
     */
    private boolean aggiungi() {
        int x, y;
        Random rand = new Random();
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (g[x][y] != 0);
        if (rand.nextInt(8) == 4) {
            g[x][y] = 4;
        } else {
            g[x][y] = 2;
        }
        numeri++;
        return true;
    }

    /**
     * Sposta la griglia verso una determinata direzione.
     *
     * @param dir Direzione dello spostamento: 'u' = UP, 'd' = DOWN, 'l' = LEFT,
     * 'r' = RIGHT.
     * @return Torna false in caso la direzione non esista oppure non è
     * possibile muovere in quella direzione, true se ha spostato con successo.
     */
    public boolean sposta(char dir) {
        boolean spostato = false, riga;
        int ctrl;
        int offset;
        if (dir == 'u') {
            for (int i = 0; i < SIZE; i++) {
                offset = 0;
                riga = false;
                ctrl=0;
                for (int j = 0; j < SIZE; j++) {
                    if(riga)
                        ctrl++;
                    if(ctrl==2)
                        riga = false;
                    if (g[j][i] != 0) {
                        try {
                            if (g[offset - 1][i] == g[j][i] && !riga) {
                                g[offset - 1][i] = g[j][i] * 2;
                                punti+=g[offset - 1][i];
                                offset--;
                                numeri--;
                                spostato = true;
                                riga = true;
                            } else
                                g[offset][i] = g[j][i];
                                
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            g[offset][i] = g[j][i];
                        }
                        if(j!=offset){
                            g[j][i] = 0;
                            spostato = true;
                        }
                        offset++;
                    }
                }
            }
        } else if (dir == 'd') {
            for (int i = 0; i < SIZE; i++) {
                offset = SIZE - 1;
                riga = false;
                ctrl = 0;
                for (int j = SIZE - 1; j >= 0; j--) {
                    if(riga)
                        ctrl++;
                    if(ctrl==2)
                        riga = false;
                    if (g[j][i] != 0) {
                        try {
                            if (g[offset + 1][i] == g[j][i] && !riga) {
                                g[offset + 1][i] = g[j][i] * 2;
                                punti+=g[offset + 1][i];
                                offset++;
                                numeri--;
                                spostato = true;
                                riga = true;
                            } else
                                g[offset][i] = g[j][i];
                                
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            g[offset][i] = g[j][i];
                        }
                        if(j!=offset){
                            g[j][i] = 0;
                            spostato = true;
                        }
                        offset--;
                    }
                }
            }
        } else if (dir == 'l') {
            for (int i = 0; i < SIZE; i++) {
                offset = 0;
                ctrl = 0;
                riga = false;
                for (int j = 0; j < SIZE; j++) {
                    if(riga)
                        ctrl++;
                    if(ctrl==2)
                        riga = false;
                    if (g[i][j] != 0) {
                        try {
                            if (g[i][offset - 1] == g[i][j] && !riga) {
                                g[i][offset - 1] = g[i][j] * 2;
                                punti+=g[i][offset - 1];
                                offset--;
                                numeri--;
                                spostato = true;
                                riga = true;
                            } else
                                g[i][offset] = g[i][j];
                                
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            g[i][offset] = g[i][j];
                        }
                        if(j!=offset){
                            g[i][j] = 0;
                            spostato = true;
                        }
                        offset++;
                    }
                }
            }
        } else if (dir == 'r') {
            for (int i = 0; i < SIZE; i++) {
                offset = SIZE - 1;
                ctrl = 0;
                riga = false;
                for (int j = SIZE - 1; j >= 0; j--) {
                    if(riga)
                        ctrl++;
                    if(ctrl==2)
                        riga = false;
                    if (g[i][j] != 0) {
                        try {
                            if (g[i][offset + 1] == g[i][j] && !riga) {
                                g[i][offset + 1] = g[i][j] * 2;
                                punti+=g[i][offset + 1];
                                offset++;
                                numeri--;
                                spostato = true;
                                riga = true;
                            } else
                                g[i][offset] = g[i][j];
                                
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            g[i][offset] = g[i][j];
                        }
                        if(j!=offset){
                            g[i][j] = 0;
                            spostato = true;
                        }
                        offset--;
                    }
                }
            }
        } else {
            return ERR;
        }
        if(spostato)
            aggiungi();
        if(punti>record){
            record = punti;
            Salvataggio s = new Salvataggio();
            s.start();
        }
        return spostato;
    }
    
    public boolean isFinita(){
        Griglia copia = this.clone();
        return !(copia.sposta('u') || copia.sposta('d') || copia.sposta('l') || copia.sposta('r'));
    }
    
    @Override
    public Griglia clone(){
        return new Griglia(this);
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                str += g[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
    
    public class Salvataggio extends Thread{
        @Override
        public void run() {
            salvaRecord();
        }
    }

//    public static void main(String[] args) {
//        Griglia gr = new Griglia();
//        System.out.println(gr);
//        char input;
//        do{
//            input = JOptionPane.showInputDialog("Insersci direzione: (u, d, l, r)").charAt(0);
//            gr.sposta(input);
//            System.out.println(gr);
//        } while(input!='e');
//    }
}
