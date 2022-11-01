package disciplina.qualidade;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	
	/**
	 * 
	 * @param int1 Este é o primeiro parametro
	 */
	
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
		throw new io.cucumber.java.PendingException();
	}
	
	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
		throw new io.cucumber.java.PendingException();
	}
	
	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
		throw new io.cucumber.java.PendingException();
	}
	
	@Given("Um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
		throw new io.cucumber.java.PendingException();
	}
	
	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
		throw new io.cucumber.java.PendingException();
	}
	
	@Then("n?o deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void n_o_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		throw new io.cucumber.java.PendingException();
	}

}
