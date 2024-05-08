package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExemplo {
	
	public static String recuperaValorDefault() {
        System.out.println("Executou o método default");
        return "em preenchi com o valor default";
    }

	public static void main(String[] args) {
		
		System.out.println("Exemplo 1");
		Optional<String> opcional = Optional.ofNullable("texto opcional");		 
        System.out.println("Tem valor no Opcional : " + opcional.isPresent());
 
        Optional<String> opcionalNulo = Optional.ofNullable(null);
        System.out.println("Tem valor no Opcional : " + opcionalNulo.isPresent() + "\n");
        
        System.out.println("Exemplo 2");
        List<Integer> lista = Arrays.asList(5, 6, 7, 8, 9, 10);
        Optional<List<Integer>> listaOpcional = Optional.ofNullable(lista);        
        listaOpcional.ifPresent(optionalList -> optionalList.forEach(valor -> System.out.println(valor)));
 
        System.out.println("\nExemplo 3"); 
        Optional<?> _opcionalNulo = Optional.ofNullable(null);
        _opcionalNulo.ifPresentOrElse((value) -> System.out.println("Esta preenchido"), () -> System.out.println("Não tem valor nenhum aqui"));
        
        System.out.println("\nExemplo 4");        
        Optional<String> intOpcional = Optional.of("89"); 
        String valorInteiro = intOpcional.orElseGet(() -> recuperaValorDefault()); 
        System.out.println(valorInteiro);
        
        System.out.println("\nExemplo 5");
        Optional<Integer> _opcional = Optional.ofNullable(1432); 
        Optional<Integer> parOuImpar = _opcional.filter(numero -> numero % 2 == 0 ); 
        parOuImpar.ifPresentOrElse(valor -> System.out.println("Numero Par"), () -> System.out.println("Numero Impar"));

	}

}
