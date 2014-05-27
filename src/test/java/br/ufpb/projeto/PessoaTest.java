package br.ufpb.projeto;

import org.junit.*;

public class PessoaTest{
 
	@Test
    public void testPessoaTest(){
		Pessoa p = new Pessoa();
        Assert.assertEquals( "Maria" ,p.getNome());
        Assert.assertTrue( "Maria" ,p.getIdade() == 20);
        Assert.assertEquals( "Mangabeira" ,p.getBairro());
        Assert.assertEquals( "Rua pedro Batista" ,p.getRua());
        Assert.assertEquals( "João Pessoa" ,p.getCidade());
        p.setNome("Jose");
        Assert.assertNotSame( "Maria" ,p.getNome());
        p.setIdade(25);
        Assert.assertFalse( "Maria" ,p.getIdade() == 20);
        p.setRua("Rua João Pessoa");
        Assert.assertNotSame( "Rua pedro Batista" ,p.getRua());
        p.setBairro("Castelo Branco");
        Assert.assertNotSame( "Mangabeira" ,p.getBairro());
        p.setCidade("Guarabira");
        Assert.assertNotSame( "João Pessoa" ,p.getCidade());
        
    }
}
