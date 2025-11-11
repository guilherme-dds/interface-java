package application;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificacaoSms notifSMS = new NotificacaoSms("Guilherme", "(14) 997568741", "Mensagem teste", 1);

        notifSMS.exibirInformacoesRemetente();
        notifSMS.enviar();
        notifSMS.registrarLog();

        notifSMS.definirPrioridade(8);
        notifSMS.obterNivelPrioridade();
        notifSMS.definirPrioridade(0);

        Notificacao notif = new NotificacaoSms("Fulano", "14997568741", "Testando", 3);
        notif.exibirInformacoesRemetente();
        notif.enviar();

        Priorizavel objPriorizavel = new NotificacaoSms("Ciclano", "14943534593", "Novo teste", 2);
        objPriorizavel.definirPrioridade(6);

        objPriorizavel = new NotificacaoEmail("Beltrano", "beltrano@gmail.com", "Aula", "Olá mundo!", 3);

        Arquivavel objArquivavel = new NotificacaoEmail("Guilherme", "guilherme@gmail.com", "Aula", "Olá mundo!", 3);

        ((Notificacao) objArquivavel).enviar();

        System.out.println("================");
        List<Priorizavel> objetos = new ArrayList<Priorizavel>();

        objetos.add(objPriorizavel);
        objetos.add(new NotificacaoSms(
            "Ciclano", "1343234567", "Novo Teste", 2));
            objetos.add(new NotificacaoSms(
            "Beltrano", "745632112", "Novo Teste2", 3));
        
        for(Priorizavel item: objetos){
            System.out.println(item.obterNivelPrioridade());
        }
    }
}

