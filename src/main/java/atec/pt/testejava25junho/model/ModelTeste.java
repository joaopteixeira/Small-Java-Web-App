package atec.pt.testejava25junho.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="OficinaTo")
public class ModelTeste{
	
	
	@Id
	public String id;
	
	public String LocalReparacao,
	DataComeco,
	DataFim,
	DescricaoAvaria,
	PecasColocadas,
	RelatorioIntervencao;
	

	
	

	public ModelTeste() {
		
	}

	public ModelTeste(String id, String localReparacao, String dataComeco, String dataFim, String descricaoAvaria,
			String pecasColocadas, String relatorioIntervencao) {
		super();
		this.id = id;
		this.LocalReparacao = localReparacao;
		this.DataComeco = dataComeco;
		this.DataFim = dataFim;
		this.DescricaoAvaria = descricaoAvaria;
		this.PecasColocadas = pecasColocadas;
		this.RelatorioIntervencao = relatorioIntervencao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocalReparacao() {
		return LocalReparacao;
	}

	public void setLocalReparacao(String localReparacao) {
		this.LocalReparacao = localReparacao;
	}

	public String getDataComeco() {
		return DataComeco;
	}

	public void setDataComeco(String dataComeco) {
		this.DataComeco = dataComeco;
	}

	public String getDataFim() {
		return DataFim;
	}

	public void setDataFim(String dataFim) {
		this.DataFim = dataFim;
	}

	public String getDescricaoAvaria() {
		return DescricaoAvaria;
	}

	public void setDescricaoAvaria(String descricaoAvaria) {
		this.DescricaoAvaria = descricaoAvaria;
	}

	public String getPecasColocadas() {
		return PecasColocadas;
	}

	public void setPecasColocadas(String pecasColocadas) {
		this.PecasColocadas = pecasColocadas;
	}

	public String getRelatorioIntervencao() {
		return RelatorioIntervencao;
	}

	public void setRelatorioIntervencao(String relatorioIntervencao) {
		this.RelatorioIntervencao = relatorioIntervencao;
	}
	
	

		
}
