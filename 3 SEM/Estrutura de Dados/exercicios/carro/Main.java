package carro;

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int i, j = 0;
		Scanner  ler= new Scanner(System.in);
		String r,carro;
		Carro vCarro[] = new Carro[10];
		
		for(i=0; i<10; i++){
			vCarro[i] = new Carro();
		}

		System.out.println("Gostaria de adicionar um carro ? (S/N): ");
		r = ler.nextLine();


		while(r.equals("S")){
			vCarro[j].marca=new Marca();
			System.out.println("Digite o modelo do carro: ");
			vCarro[j].modelo = ler.nextLine();
			System.out.println("Informe o ano: ");
			vCarro[j].ano = ler.nextInt();
			System.out.println("Informe o preço do carro: ");
			vCarro[j].preco = ler.nextFloat();
			System.out.println("Digite a marca do carro: ");
			vCarro[j].marca.nome = ler.nextLine();
			vCarro[j].marca.nome = ler.nextLine();
			System.out.println("deseja cadastrar outro carro");
			r=ler.nextLine();
			j++;
		}
		System.out.println("digite o modelo um carro");
		carro=ler.nextLine();
		for(j=0;j<10;) {
			if(carro.equals(vCarro[j].modelo)){
				System.out.println(vCarro[j].modelo);
				System.out.println(vCarro[j].ano);
				System.out.println(vCarro[j].preco);
				System.out.println(vCarro[j].marca.nome);
				break;
			}else{
				System.out.println("Carro inexistente");
				break;
			}
		}
	}
}