package model;

public class PaisServece {
	PaisDAO dao;
	
	public PaisServece() {
		
	}
	
	public void Pais() {
		dao = new PaisDAO();
	}
	
	public void criar(Pais p) {
		dao.incluir(p);
	}
	
	public void atualizar(Pais p) {
		dao.atualizar(p);
	}
	
	public void excluir(Pais p) {
		dao.excluir(p);
	}
	
	public Pais carregar (int id) {
		Pais p = dao.carregar(id);
		return p;
	}
}
