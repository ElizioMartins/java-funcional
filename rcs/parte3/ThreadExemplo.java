package rcs.parte3;

public class ThreadExemplo {
    public static void main(String[] args) {
        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        BarraDeCarregamento3 barraDeCarregamento3 = new BarraDeCarregamento3();
        barraDeCarregamento2.start();
        barraDeCarregamento3.start();

    }
}
class GerarPDF implements Runnable {
    @Override
    public void run(){
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable {
    @Override
    public void run(){
        System.out.println("Loading ....");
    }
}

class BarraDeCarregamento2 extends Thread{
    @Override
    public void run(){
        System.out.println("Rodei BarraDeCarregamento2 : " + this.getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 extends Thread{
    @Override
    public void run(){
        System.out.println("Rodei BarraDeCarregamento3 : " + this.getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}