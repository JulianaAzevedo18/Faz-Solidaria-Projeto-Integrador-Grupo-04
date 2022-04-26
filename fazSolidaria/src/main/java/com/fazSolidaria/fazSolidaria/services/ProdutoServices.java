package com.fazSolidaria.fazSolidaria.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazSolidaria.fazSolidaria.model.ProdutoModel;
import com.fazSolidaria.fazSolidaria.repository.ProdutoRepository;

@Service
public class ProdutoServices {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public List<ProdutoModel> mostrarProdutosCadastrados(){
		return produtoRepository.findAll();
	}
	
	public ProdutoModel mostrarProdutoPeloNome(String nome){
		return produtoRepository.findAllByNomeIgnoreCase(nome);
	}
	
	public ProdutoModel cadastrarProduto(ProdutoModel produto) {
		return produtoRepository.save(produto);
	}
	
	public Optional<ProdutoModel> alterarInformacaoProduto(Long produto) {
		return produtoRepository.findById(produto);
	}
	
	public Optional<ProdutoModel> deletarProduto(Long id) {
		return produtoRepository.findById(id);
	}
	
	
}
