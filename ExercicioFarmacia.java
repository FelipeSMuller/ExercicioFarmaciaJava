package senaiprojetos;

import javax.swing.JOptionPane;

public class ExercicioFarmacia {

	public static void main(String[] args) {

		/*
		 * Uma farmácia precisa ajustar os preços de seus produtos em 12%. Elabore uma
		 * classe que receba o valor do produto e aplique o percentual de acréscimo. O
		 * novo valor a ser calculado deve ser arredondado para mais ou para menos
		 * usando o método round. A classe deve também conter um laço de repetição que
		 * encerre o programa quando o usuário fornecer o valor zero (0) para o valor do
		 * produto. Dessa forma, o usuário digita o valor do produto, a classe calcula e
		 * mostra o valor com acréscimo, a seguir solicita um novo valor. Esse processo
		 * continua enquanto o valor do produto for diferente de zero; caso contrário o
		 * programa será encerrado.
		 */

		Double acrescimo, valorFinal;
		int valorDoUsuario = 0;
		acrescimo = 1.12;

		while (true) {

			valorDoUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor que você possui"));
			if (valorDoUsuario < 0) {
				JOptionPane.showMessageDialog(null, "Você digitou um valor menor que 0 , ERRO!");
				break;
			} else {
				System.out.println("-------------");

			}
			valorFinal = valorDoUsuario * acrescimo;

			switch (valorDoUsuario) {

			case 0:
				JOptionPane.showMessageDialog(null,
						" Você digitou um valor inválido, não é possivel efetuar operações com o valor que você possui \n reinicie o processo!");
				break;
			default:
				JOptionPane.showMessageDialog(null, " O seu valor inicial de R$ " + valorDoUsuario
						+ " teve um reajuste de 12% e agora o novo valor será de R$ " + Math.round(valorFinal));
			}
		}

	}

}
