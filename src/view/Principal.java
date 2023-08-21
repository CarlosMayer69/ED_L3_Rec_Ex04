package view;

import controller.ConversaoBinarioController;

public class Principal {

	public static void main(String[] args) {
		
		ConversaoBinarioController cb = new ConversaoBinarioController();
		
		int num = 45;
		String conversaopBinario = cb.conversaopBinario(num);
		
	        System.out.println(conversaopBinario);
			
	    }


	}
