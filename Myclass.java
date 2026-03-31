public class MyClass {
    public static void main(String args[]) {
       Automovel opala=new Automovel();
       
       opala.setMassa(2000);
       opala.setCor("Azul");
       opala.setPorta(4);
       System.out.println("Massa="+opala.getMassa());
       System.out.println("Cor="+opala.getCor());
       System.out.println("Portas="+opala.getPorta());
       
       Automovel astra=new Automovel();
       
       astra.setMassa(1700);
       astra.setCor("Preto");
       astra.setPorta(4);
       System.out.println("Massa="+astra.getMassa());
       System.out.println("Cor="+astra.getCor());
       System.out.println("Portas="+astra.getPorta());
       
       Automovel gol=new Automovel();
       
       gol.setMassa(1200);
       gol.setCor("Branco");
       gol.setPorta(2);
       System.out.println("Massa="+gol.getMassa());
       System.out.println("Cor="+gol.getCor());
       System.out.println("Portas="+gol.getPorta());
       
       Motocicleta CG160=new Motocicleta();
       
       CG160.setMassa(250);
       CG160.setCor("Azul");
       CG160.setRodas(2);
       System.out.println("Massa="+CG160.getMassa());
       System.out.println("Cor="+CG160.getCor());
       System.out.println("Rodas="+CG160.getRodas());
       
       Motocicleta XRE=new Motocicleta();
       
       XRE.setMassa(400);
       XRE.setCor("Amarelo");
       XRE.setRodas(2);
       System.out.println("Massa="+XRE.getMassa());
       System.out.println("Cor="+XRE.getCor());
       System.out.println("Rodas="+XRE.getRodas());
       
       Motocicleta Tricity=new Motocicleta();
       
       Tricity.setMassa(400);
       Tricity.setCor("Cinza");
       Tricity.setRodas(3);
       System.out.println("Massa="+Tricity.getMassa());
       System.out.println("Cor="+Tricity.getCor());
       System.out.println("Rodas="+Tricity.getRodas());
       
       
    }
    
}
