package com.streamapi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> saudacao = () -> "Ola, seja bem vindo(a)!";
		Supplier<String> _saudacao = () -> "Hello, welcome!";
		
		List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).collect(Collectors.toList());
		List<String> _listaSaudacoes = Stream.generate(_saudacao).limit(5).toList();
		
		listaSaudacoes.forEach(s -> System.out.println(s));
		_listaSaudacoes.forEach(System.out::println);

	}

}
