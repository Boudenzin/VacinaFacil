import exceptions.PacienteJaCadastradoException;
import exceptions.PacienteNaoEncontradoException;
import exceptions.VacinaNaoEncontradaException;

import java.util.List;

public interface AgendamentoVacinaInterface {

    public void cadastrarPaciente(String cartaoSUS, Paciente paciente) throws PacienteJaCadastradoException;

    public void agendarVacina(String cartaoSUS, Vacina vacina) throws PacienteNaoEncontradoException;

    public void removerVacinaDePaciente(String cartaoSUS, Vacina vacina) throws PacienteNaoEncontradoException, VacinaNaoEncontradaException;

    public void alterarDataDeVacinaDoPaciente(String cartaoSUS, Vacina vacina, Data data, Hora hora) throws PacienteNaoEncontradoException, VacinaNaoEncontradaException;

    public void alterarVacinaDePaciente(String cartaoSUS, Vacina vacinaAntiga, Vacina vacinaNova) throws PacienteNaoEncontradoException, VacinaNaoEncontradaException;

    public void removerPacienteDoSistema(String cartaoSUS) throws PacienteNaoEncontradoException;

    public Paciente pesquisarPaciente(String cartaoSUS);

    public Data pesquisarDataAgendada(String cartaoSUS, Vacina vacina, Data data) throws PacienteNaoEncontradoException, VacinaNaoEncontradaException;

    public List<Vacina> pesquisarTodasAsVacinasDoPaciente(String cartaoSUS) throws PacienteNaoEncontradoException;


}
